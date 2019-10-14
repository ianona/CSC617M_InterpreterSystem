package sample;

import antlr4.EzBrewLexer;
import antlr4.EzBrewParser;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.util.Pair;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.controlsfx.control.StatusBar;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;
import org.reactfx.Subscription;

import java.io.*;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.regex.Matcher;

public class Controller {
    @FXML private Button runBtn;
    @FXML private CodeArea codeArea;
    @FXML private TextArea consoleArea;
    @FXML private AnchorPane bottomAnchor;
    @FXML private AnchorPane topAnchor;
    @FXML private SplitPane splitPane;
    @FXML private StatusBar statusBar;

    @FXML public void initialize(){
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        codeArea.prefWidthProperty().bind(topAnchor.widthProperty());
        codeArea.prefHeightProperty().bind(topAnchor.heightProperty());

        consoleArea.setEditable(false);
        consoleArea.setFocusTraversable(false);

        consoleArea.prefWidthProperty().bind(bottomAnchor.widthProperty());
        consoleArea.prefHeightProperty().bind(bottomAnchor.heightProperty());

        splitPane.setDividerPositions(0.8);

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
    }

    private static StyleSpans<Collection<String>> computeHighlighting(String text) {
        Matcher matcher = Constants.PATTERN.matcher(text);
        int lastKwEnd = 0;
        StyleSpansBuilder<Collection<String>> spansBuilder
                = new StyleSpansBuilder<>();
        while(matcher.find()) {
            String styleClass =
                    matcher.group("KEYWORD") != null ? "keyword" :
                            matcher.group("PAREN") != null ? "paren" :
                                    matcher.group("BRACE") != null ? "brace" :
                                            matcher.group("BRACKET") != null ? "bracket" :
                                                    matcher.group("SEMICOLON") != null ? "semicolon" :
                                                            matcher.group("STRING") != null ? "string" :
                                                                    matcher.group("OPERATOR") != null ? "operator" :
                                                                            matcher.group("COMMENT") != null ? "comment" :
                                                                                    null; /* never happens */ assert styleClass != null;
            spansBuilder.add(Collections.emptyList(), matcher.start() - lastKwEnd);
            spansBuilder.add(Collections.singleton(styleClass), matcher.end() - matcher.start());
            lastKwEnd = matcher.end();
        }
        spansBuilder.add(Collections.emptyList(), text.length() - lastKwEnd);
        return spansBuilder.create();
    }

    private void consoleLog(String log){
        consoleArea.appendText(log);
        consoleArea.appendText("\n");
    }

    private void clearConsole(){
        consoleArea.clear();
    }

    private void updateStatus(String status){
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
        parser.compilationUnit();

        int errors_count = Arrays.stream(listener.getSyntaxErrors().toArray())
                .filter(error -> ((SyntaxError)error).getMessage().contains("token recognition"))
                .toArray().length;

        if (errors_count != 0) {
            consoleLog("----------Token Errors----------");
            Arrays.stream(listener.getSyntaxErrors().toArray())
                    .filter(error -> ((SyntaxError)error).getMessage().contains("token recognition"))
                    .forEach(
                            error -> consoleLog(((SyntaxError)error).getMessage())
                    );
        }

        EzBrewLexer lexer2 = new EzBrewLexer(new ANTLRInputStream(codeArea.getText()));
        consoleLog("----------Tokens----------");
        int count = 0;
        int ws_count = 0;
        int valid_count = 0;
        for (Token token: lexer2.getAllTokens()){
            String tokenClass = null;
            String symbolicName = vocabulary.getSymbolicName(token.getType());

            if (symbolicName.contains("COMMENT")){
                tokenClass = "COMMENT";
            } else if (symbolicName.contains("IDENTIFIER")) {
                tokenClass = "IDENTIFIER";
            } else if (symbolicName.contains("LITERAL")) {
                tokenClass = "LITERAL";
            } else if (token.getType() >= 65 && token.getType() <= 73) {
                tokenClass = "SEPARATOR";
            } else if (token.getType() >= 74 && token.getType() <= 90) {
                tokenClass = "OPERATOR";
            } else if (token.getType() >= 22 && token.getType() <= 59){
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
            } else{

            }

            System.out.println(token.getText());
            System.out.println("Channel: " + token.getChannel());
            System.out.println("Type: " + vocabulary.getSymbolicName(token.getType()));
            System.out.println("------");
            count++;
        }
        Main.getInstance().successNotif("Scan","Scan complete, found " + count + " tokens");
        updateStatus(count + " tokens found (" + ws_count + " whitespace tokens, " + valid_count + " valid tokens, " + errors_count + " errors)");
    }

    public void onParseClick(ActionEvent actionEvent) {
        EzBrewLexer lexer = new EzBrewLexer(new ANTLRInputStream(codeArea.getText()));
        TokenStream tokenStream = new CommonTokenStream(lexer);
        EzBrewParser parser = new EzBrewParser(tokenStream);
        ParseTree tree = parser.compilationUnit();
        TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
        viewr.setScale(.3);
        viewr.open();
    }


    public void onRunClick(ActionEvent actionEvent) {
        Main.getInstance().failNotif("Run","Function not implemented yet");
    }

    public void onClearClick(ActionEvent actionEvent) {
        codeArea.clear();
        consoleArea.clear();
        Main.getInstance().successNotif("Clear","Editor cleared");
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

        String week_days[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
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
                    this.getClass().getResource(mode.toLowerCase()+"-mode.css").toExternalForm()
            );
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
            while ((str = in.readLine())!=null) {
                codeArea.appendText(str);
                codeArea.appendText("\n");
            }
        } catch (FileNotFoundException ex) {
            Main.getInstance().failNotif("Load",ex.getMessage());
        } catch (IOException ex) {
            Main.getInstance().failNotif("Load",ex.getMessage());
        } finally {
            Main.getInstance().successNotif("Open",file.getName() + " loaded");
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
            Main.getInstance().failNotif("Save",ex.getMessage());
        } finally {
            Main.getInstance().successNotif("Save",file.getName() + " saved");
        }
    }

}
