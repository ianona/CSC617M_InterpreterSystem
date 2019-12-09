package sample;

import antlr4.EzBrewLexer;
import antlr4.EzBrewParser;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.*;
import javafx.util.Pair;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.controlsfx.control.StatusBar;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;
import org.reactfx.Subscription;

import java.awt.*;
import java.io.*;
import java.time.Duration;
import java.util.List;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Controller {
    @FXML
    private Button runBtn;
    @FXML
    private Button runStepBtn;
    @FXML
    private Button stopBtn;
    @FXML
    private CodeArea codeArea;
    @FXML
    private TextArea consoleArea;
    @FXML
    private ListView consoleArea2;
    @FXML
    private ListView consoleArea3;
    @FXML
    private VBox rightBox;
    @FXML
    private AnchorPane bottomAnchor;
    @FXML
    private AnchorPane topAnchor;
    @FXML
    private SplitPane splitPane;
    @FXML
    private StatusBar statusBar;
    @FXML
    private CheckBox parseChk;
    @FXML
    private Button optimizeBtn;

    private Stage watchStage;
    private int stepCount;
    private String stepFunc;
    private Interpreter stepInterpreter;

    @FXML
    public void initialize() {
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        codeArea.prefWidthProperty().bind(topAnchor.widthProperty());
        codeArea.prefHeightProperty().bind(topAnchor.heightProperty());

        consoleArea.setEditable(false);
        consoleArea.setFocusTraversable(false);

        consoleArea.prefWidthProperty().bind(bottomAnchor.widthProperty());
        consoleArea.prefHeightProperty().bind(bottomAnchor.heightProperty());

        consoleArea2.prefWidthProperty().bind(rightBox.widthProperty());
        consoleArea2.prefHeightProperty().bind(rightBox.heightProperty());

        consoleArea3.prefWidthProperty().bind(rightBox.widthProperty());
        consoleArea3.prefHeightProperty().bind(rightBox.heightProperty());

        splitPane.setDividerPositions(0.8);

        codeArea.textProperty().addListener((ov, oldv, newv) -> {
            populateCodeOutline();
        });

        // syntax highlighting
        // recompute the syntax highlighting 100 ms after user stops editing area
        Subscription cleanupWhenNoLongerNeedIt = codeArea

                // plain changes = ignore style changes that are emitted when syntax highlighting is reapplied
                // multi plain changes = save computation by not rerunning the code multiple times
                //   when making multiple changes (e.g. renaming a method at multiple parts in file)
                .multiPlainChanges()

                // do not emit an event until 500 ms have passed since the last emission of previous stream
                .successionEnds(Duration.ofMillis(100))

                // run the following code block when previous stream emits an event
                .subscribe(ignore -> codeArea.setStyleSpans(0, computeHighlighting(codeArea.getText())));

        // when no longer need syntax highlighting and wish to clean up memory leaks
        // run: `cleanupWhenNoLongerNeedIt.unsubscribe();`

        // auto-indent: insert previous line's indents on enter
        final Pattern whiteSpace = Pattern.compile("^\\s+");
        codeArea.addEventHandler(KeyEvent.KEY_PRESSED, KE ->
        {
            if (KE.getCode() == KeyCode.ENTER) {
                int caretPosition = codeArea.getCaretPosition();
                int currentParagraph = codeArea.getCurrentParagraph();
                Matcher m0 = whiteSpace.matcher(codeArea.getParagraph(currentParagraph - 1).getSegments().get(0));
                if (m0.find()) Platform.runLater(() -> codeArea.insertText(caretPosition, m0.group()));
            }
        });

        codeArea.addEventHandler(KeyEvent.KEY_PRESSED, KE -> {
            if (KE.getCode() == KeyCode.TAB) {
                int caretPosition = codeArea.getCaretPosition();
                int currentParagraph = codeArea.getCaretPosition();

                if (codeArea.getText(caretPosition - 3, caretPosition - 1).contains("pt")) {
                    Platform.runLater(() -> codeArea.replaceText(caretPosition - 3, caretPosition - 1, "print();"));
                }

                if (codeArea.getText(caretPosition - 3, caretPosition - 1).contains("dd")) {
                    Platform.runLater(() -> codeArea.replaceText(caretPosition - 3, caretPosition - 1, "do{ \n\n }during();"));
                }

                if (codeArea.getText(caretPosition - 3, caretPosition - 1).contains("du")) {
                    Platform.runLater(() -> codeArea.replaceText(caretPosition - 3, caretPosition - 1, "during(){ \n\n }"));
                }

                if (codeArea.getText(caretPosition - 3, caretPosition - 1).contains("ob")) {
                    Platform.runLater(() -> codeArea.replaceText(caretPosition - 3, caretPosition - 1, "<!>PUT CLASS NAME AFTER BLUEPRINT<!>\n open blueprint { \n\n }"));
                }
            }
        });
    }

    private static StyleSpans<Collection<String>> computeHighlighting(String text) {
        Matcher matcher = Constants.PATTERN.matcher(text);
        int lastKwEnd = 0;
        StyleSpansBuilder<Collection<String>> spansBuilder
                = new StyleSpansBuilder<>();
        while (matcher.find()) {
            String styleClass =
                    matcher.group("KEYWORD") != null ? "keyword" :
                            matcher.group("PAREN") != null ? "paren" :
                                    matcher.group("BRACE") != null ? "brace" :
                                            matcher.group("BRACKET") != null ? "bracket" :
                                                    matcher.group("SEMICOLON") != null ? "semicolon" :
                                                            matcher.group("STRING") != null ? "string" :
                                                                    matcher.group("CHAR") != null ? "char" :
                                                                            matcher.group("OPERATOR") != null ? "operator" :
                                                                                    matcher.group("COMMENT") != null ? "comment" :
                                                                                            null; /* never happens */
            assert styleClass != null;
            spansBuilder.add(Collections.emptyList(), matcher.start() - lastKwEnd);
            spansBuilder.add(Collections.singleton(styleClass), matcher.end() - matcher.start());
            lastKwEnd = matcher.end();
        }
        spansBuilder.add(Collections.emptyList(), text.length() - lastKwEnd);
        return spansBuilder.create();
    }

    public void consoleLog(String log) {
        consoleArea.appendText(log);
        consoleArea.appendText("\n");
    }

    private void sideLog(List<String> toLog) {
        consoleArea2.getItems().clear();
        consoleArea2.setItems(FXCollections.observableList(toLog));
    }

    private void sideLogSelect(int index) {
        consoleArea2.getSelectionModel().select(index);
    }

    private void clearConsole() {
        consoleArea.clear();
    }

    private void updateStatus(String status) {
        statusBar.setText(status);
    }

    public void onScanClick(ActionEvent actionEvent) {
        CollectingErrorListener listener = new CollectingErrorListener();
        clearConsole();

        EzBrewLexer lexer = new EzBrewLexer(new ANTLRInputStream(codeArea.getText()));
        Vocabulary vocabulary = lexer.getVocabulary();
//        lexer.removeErrorListeners();
        lexer.addErrorListener(listener);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EzBrewParser parser = new EzBrewParser(tokens);
//        parser.removeErrorListeners();
        parser.addErrorListener(listener);
        parser.start();

        int errors_count = Arrays.stream(listener.getSyntaxErrors().toArray())
                .filter(error -> ((SyntaxError) error).getMessage().contains("token recognition"))
                .toArray().length;

        if (errors_count != 0) {
            consoleLog("----------Token Errors----------");
            Arrays.stream(listener.getSyntaxErrors().toArray())
                    .filter(error -> ((SyntaxError) error).getMessage().contains("token recognition"))
                    .forEach(
                            error -> consoleLog(((SyntaxError) error).getMessage())
                    );
        }
        EzBrewLexer lexer2 = new EzBrewLexer(new ANTLRInputStream(codeArea.getText()));
        consoleLog("----------Tokens----------");
        int count = 0;
        int ws_count = 0;
        int valid_count = 0;
        for (Token token : lexer2.getAllTokens()) {
            String tokenClass = null;
            String symbolicName = vocabulary.getSymbolicName(token.getType());
            System.out.println(symbolicName);

            if (symbolicName.contains("COMMENT")) {
                tokenClass = "COMMENT";
            } else if (symbolicName.contains("IDENTIFIER")) {
                tokenClass = "IDENTIFIER";
            } else if (symbolicName.contains("LITERAL")) {
                tokenClass = "LITERAL";
            } else if (token.getType() >= 43 && token.getType() <= 51) {
                tokenClass = "SEPARATOR";
            } else if (token.getType() >= 52 && token.getType() <= 72) {
                tokenClass = "OPERATOR";
            } else if (token.getType() >= 17 && token.getType() <= 37) {
                tokenClass = "KEYWORD";
            } else if (symbolicName.contains("WS")) {
                ws_count++;
            } else if (symbolicName == "ERROR") {
                tokenClass = "ERROR";
                errors_count++;
                valid_count--;
            }

            if (tokenClass != null) {
                consoleLog(token.getText() + "\t\t\t" + tokenClass);
                valid_count++;
            } else {

            }

            System.out.println(token.getText());
            System.out.println("Channel: " + token.getChannel());
            System.out.println("Type: " + vocabulary.getSymbolicName(token.getType()));
            System.out.println("------");
            count++;
        }
        Main.getInstance().successNotif("Scan", "Scan complete, found " + count + " tokens");
        updateStatus(count + " tokens found (" + ws_count + " whitespace tokens, " + valid_count + " valid tokens, " + errors_count + " errors)");
    }

    public void onOptimizeClick(ActionEvent actionEvent) {
        String wholecode = codeArea.getText();

        if (consoleArea.getText().contains("No Parsing Errors")) {
            CodeOptimizer listener = new CodeOptimizer();
            codeArea.clear();
            codeArea.appendText(listener.getCode(wholecode));
        }
    }

    public void onParseClick(ActionEvent actionEvent) {
        clearConsole();
        EzBrewLexer lexer = new EzBrewLexer(new ANTLRInputStream(codeArea.getText()));
        TokenStream tokenStream = new CommonTokenStream(lexer);
        EzBrewParser parser = new EzBrewParser(tokenStream);
        ParseTree tree = parser.start();

        if (parseChk.isSelected()) {
            TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
            viewr.open();
            viewr.setBoxColor(Color.black);
            viewr.setTextColor(Color.WHITE);
        }

        CustomErrorListener listener = new CustomErrorListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
        List<String> errors = listener.getErrors();

        if (errors.size() == 0) {
            consoleLog("----------No Parsing Errors----------");
        } else {
            for (String error : errors) {
                consoleLog(error);
//                codeArea.appendText(error);
//                codeArea.appendText("\n");
            }
        }

    }

    public void onRunClick(ActionEvent actionEvent) {
        clearConsole();

        EzBrewLexer lexer = new EzBrewLexer(new ANTLRInputStream(codeArea.getText()));
        TokenStream tokenStream = new CommonTokenStream(lexer);
        EzBrewParser parser = new EzBrewParser(tokenStream);
        ParseTree tree = parser.start();

        CustomErrorListener errorListener = new CustomErrorListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(errorListener, tree);
        List<String> errors = errorListener.getErrors();

        if (errors.size() != 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText("Parsing error detected");
            alert.setContentText("Will not execute code");

            alert.showAndWait();
            return;
        }

        ParseTreeWalker walker2 = new ParseTreeWalker();
        SampleListener listener = new SampleListener();
        walker2.walk(listener, tree);
        System.out.println("---------");

        printMap(listener.getTAC());

        SampleListener listener2 = new SampleListener();
        walker2.walk(listener2, tree);
        Interpreter interpreter = new Interpreter(listener2.getTAC(), consoleArea);
        interpreter.functionCall(Constants.MAIN);
    }

    public void printMap(Map mp) {
        List<String> TAC = new ArrayList<>();
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            Key curKey = (Key) pair.getKey();
            String curVal = (String) pair.getValue();

            String toAdd = "";
            if (curVal != null) {
                System.out.print("\t");
                toAdd += "\t";
                if (curKey.getName().charAt(0) == '@') {
                    System.out.println(curKey.getName() + " " + (curKey.getInfo() != null ? curKey.getInfo() : "") + " " + pair.getValue());
                    toAdd += curKey.getName() + " " + (curKey.getInfo() != null ? curKey.getInfo() : "") + " " + pair.getValue();
                } else if (curVal.isEmpty()) {
                    System.out.println(curKey.getName());
                    toAdd += curKey.getName();
                } else {
                    System.out.println(curKey.getName() + " = " + pair.getValue());
                    toAdd += curKey.getName() + " = " + pair.getValue();
                }

                if (curKey.getName() == Constants.END_FUNC) {
                    toAdd = "";
                    System.out.println();
                }

                TAC.add(toAdd);
            } else {
                TAC.add(curKey.getName() + ":");
                System.out.println(curKey.getName() + ":");
            }
            it.remove(); // avoids a ConcurrentModificationException
        }
        sideLog(TAC);
    }


    public void onRunStepClick(ActionEvent actionEvent) {
        if (watchStage == null) {
            try {
                Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
                Constants.SCREEN_HEIGHT_2 = (int) (primaryScreenBounds.getHeight() * 0.70);
                Constants.SCREEN_WIDTH_2 = (int) (primaryScreenBounds.getWidth() * 0.35);

                Parent root = FXMLLoader.load(getClass().getResource("watchstage.fxml"));
                watchStage = new Stage();
                watchStage.setScene(new Scene(root, Constants.SCREEN_WIDTH_2, Constants.SCREEN_HEIGHT_2));
                watchStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                    @Override
                    public void handle(WindowEvent event) {
                        // consume event
                        event.consume();
                    }
                });
                watchStage.initStyle(StageStyle.UTILITY);
                watchStage.setTitle(Constants.WATCH_NAME);
                watchStage.show();

                stopBtn.setDisable(false);
                runBtn.setDisable(true);
                stepCount = 0;
                stepFunc = Constants.MAIN;

                clearConsole();

                EzBrewLexer lexer = new EzBrewLexer(new ANTLRInputStream(codeArea.getText()));
                TokenStream tokenStream = new CommonTokenStream(lexer);
                EzBrewParser parser = new EzBrewParser(tokenStream);
                ParseTree tree = parser.start();

                CustomErrorListener errorListener = new CustomErrorListener();
                ParseTreeWalker walker = new ParseTreeWalker();
                walker.walk(errorListener, tree);
                List<String> errors = errorListener.getErrors();

                if (errors.size() != 0) {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Error");
                    alert.setHeaderText("Parsing error detected");
                    alert.setContentText("Will not execute code");

                    alert.showAndWait();
                    return;
                }

                SampleListener listener = new SampleListener();
                walker.walk(listener, tree);
                printMap(listener.getTAC());

                ParseTreeWalker walker2 = new ParseTreeWalker();
                SampleListener listener2 = new SampleListener();
                walker2.walk(listener2, tree);
                stepInterpreter = new Interpreter(listener2.getTAC(), consoleArea);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Pair<String, Integer> pair = stepInterpreter.functionCall(stepFunc, stepCount);
            // finished running all the code
            if (pair == null) {
                Main.getInstance().infoNotif("Code Done Running", "All lines of code have been run or program has terminated.");
                runStepBtn.setDisable(true);
            } else {
                sideLogSelect(pair.getValue());
                stepCount = pair.getValue();
                stepFunc = pair.getKey();

                Watchstage.getInstance().updateSymbolTable(stepInterpreter.getSymbolTable());
                Watchstage.getInstance().updateTempTable(stepInterpreter.getTempTable());
            }
        }
    }

    public void onStopClick(ActionEvent actionEvent) {
        stopBtn.setDisable(true);
        runBtn.setDisable(false);
        runStepBtn.setDisable(false);
        stepInterpreter = null;

        watchStage.close();
        watchStage = null;
    }

    public void onClearClick(ActionEvent actionEvent) {
        codeArea.clear();
        consoleArea.clear();
        consoleArea2.getItems().clear();
        consoleArea3.getItems().clear();
        Main.getInstance().successNotif("Clear", "Editor cleared");
        updateStatus("Console ready");
    }

    public void onOpenClick(ActionEvent actionEvent) {
        loadDocument();
    }

    public void onSaveClick(ActionEvent actionEvent) {
        saveDocument();
    }

    public void onOptionsClick(ActionEvent actionEvent) {
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Options");
        dialog.setHeaderText("Customize IDE");
        dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);

//        dialog.setGraphic(new ImageView(this.getClass().getResource("login.png").toString()));

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        String week_days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        ComboBox username = new ComboBox(FXCollections.observableArrayList(Constants.IDE_MODES));
        username.getSelectionModel().select(Main.getInstance().getMode());
        ComboBox dummy = new ComboBox(FXCollections.observableArrayList(week_days));
        dummy.getSelectionModel().select("Wednesday");

        grid.add(new Label("IDE Mode:"), 0, 0);
        grid.add(username, 1, 0);
        grid.add(new Label("Dummy:"), 0, 1);
        grid.add(dummy, 1, 1);
        dialog.getDialogPane().setContent(grid);

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == ButtonType.OK) {
                return new Pair<>(
                        username.getSelectionModel().getSelectedItem().toString(),
                        dummy.getSelectionModel().getSelectedItem().toString()
                );
            }
            return null;
        });

        Optional<Pair<String, String>> result = dialog.showAndWait();
        result.ifPresent(options -> {
            String mode = options.getKey();
            Main.getInstance().setMode(mode);

            System.out.println("Mode=" + mode + ", Dummy=" + options.getValue());

            // update stylesheets
            Main.getInstance().getPrimaryStage().getScene().getStylesheets().clear();
            Main.getInstance().getPrimaryStage().getScene().getStylesheets().add(
                    this.getClass().getResource("common-style.css").toExternalForm()
            );
            Main.getInstance().getPrimaryStage().getScene().getStylesheets().add(
                    this.getClass().getResource(mode.toLowerCase() + "-mode.css").toExternalForm()
            );
        });
    }

    public void onRefactorClick(ActionEvent actionEvent) {
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Refactor");
        dialog.setHeaderText("Refactor function names");
        dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        String text = codeArea.getText();
        Pattern pattern = Pattern.compile("(\\bemp\\b|\\bstring\\b|\\bnum\\b|\\bsdec\\b|\\bddec\\b|\\bbool\\b)\\s+[a-zA-Z0-9]+\\s*[(][a-zA-Z0-9, ]*\\s*[)]");
        Matcher matcher = pattern.matcher(text);
        List<String> functions = new ArrayList<>();
        while (matcher.find()) {
            String line = text.substring(matcher.start(), matcher.end());
            String funcName = line.split(" ")[1];
            if (funcName.contains("("))
                funcName = funcName.split("\\(")[0];
            System.out.println(funcName);
            functions.add(funcName);
        }

        ComboBox function = new ComboBox(FXCollections.observableArrayList(functions));
        function.getSelectionModel().select(0);
        TextField namefield = new TextField("functionX");

        grid.add(new Label("Function:"), 0, 0);
        grid.add(function, 1, 0);
        grid.add(new Label("New Name:"), 0, 1);
        grid.add(namefield, 1, 1);
        dialog.getDialogPane().setContent(grid);

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == ButtonType.OK) {
                return new Pair<>(
                        function.getSelectionModel().getSelectedItem().toString(),
                        namefield.getText()
                );
            }
            return null;
        });

        Optional<Pair<String, String>> result = dialog.showAndWait();
        result.ifPresent(options -> {
            String functionName = options.getKey();
            String newName = options.getValue();

            System.out.println("Function=" + functionName + ", New  name=" + newName);
            codeArea.replaceText(codeArea.getText().replace(functionName, newName));
        });
    }

    public void populateCodeOutline() {
//        System.out.println("Filling code outline table");
        String text = codeArea.getText();
        Pattern pattern = Pattern.compile("(\\bemp\\b|\\bstring\\b|\\bnum\\b|\\bsdec\\b|\\bddec\\b|\\bbool\\b)\\s+[a-zA-Z0-9]+\\s*[(][a-zA-Z0-9, ]*\\s*[)]");
        Matcher matcher = pattern.matcher(text);
        List<String> functions = new ArrayList<>();
        while (matcher.find()) {
            String line = text.substring(matcher.start(), matcher.end());
            if (line.contains(" ")) {
                String funcName;
                funcName = line.split(" ")[1];
                if (funcName.contains("("))
                    funcName = funcName.split("\\(")[0];
                funcName = funcName.replaceAll("[^A-Za-z0-9]", "");
//                System.out.println("this is " + funcName);
//                System.out.println(funcName.length());
                functions.add(funcName);
                functions = functions.stream().distinct().collect(Collectors.toList());
//                System.out.println(functions);
            }
        }

        consoleArea3.setItems(FXCollections.observableList(functions));
        consoleArea3.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                System.out.println("Clicked on " + consoleArea3.getSelectionModel().getSelectedItem());
                System.out.println(codeArea.getText().indexOf(String.valueOf(consoleArea3.getSelectionModel().getSelectedItem())));
                codeArea.moveTo(codeArea.getText().indexOf(String.valueOf(consoleArea3.getSelectionModel().getSelectedItem())) + 1);
                codeArea.selectWord();
            }
        });

    }

    private void loadDocument() {
        String initialDir = System.getProperty("user.dir");
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Load document");
        fileChooser.setInitialDirectory(new File(initialDir));
        fileChooser.setSelectedExtensionFilter(
                new FileChooser.ExtensionFilter("Arbitrary EzBrew file", "*" + Constants.EZB_EXTENSION));
        File selectedFile = fileChooser.showOpenDialog(Main.getInstance().getPrimaryStage());
        if (selectedFile != null) {
            codeArea.clear();
            load(selectedFile);
        }
    }

    private void load(File file) {
        BufferedReader in;
        try {
            in = new BufferedReader(new FileReader(file.getName()));
            String str;
            while ((str = in.readLine()) != null) {
                codeArea.appendText(str);
                codeArea.appendText("\n");
            }
        } catch (FileNotFoundException ex) {
            Main.getInstance().failNotif("Load", ex.getMessage());
        } catch (IOException ex) {
            Main.getInstance().failNotif("Load", ex.getMessage());
        } finally {
            Main.getInstance().successNotif("Open", file.getName() + " loaded");
        }
    }

    private void saveDocument() {
        String initialDir = System.getProperty("user.dir");
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save document");
        fileChooser.setInitialDirectory(new File(initialDir));
        fileChooser.setInitialFileName("example ezb file" + Constants.EZB_EXTENSION);
        File selectedFile = fileChooser.showSaveDialog(Main.getInstance().getPrimaryStage());
        if (selectedFile != null) {
            save(selectedFile);
        }
    }

    private void save(File file) {
        try {
            PrintWriter writer;
            writer = new PrintWriter(file);
            writer.println(codeArea.getText());
            writer.close();
        } catch (IOException ex) {
            Main.getInstance().failNotif("Save", ex.getMessage());
        } finally {
            Main.getInstance().successNotif("Save", file.getName() + " saved");
        }
    }
}
