package sample;

import antlr4.EzBrewLexer;
import com.sun.tools.javah.Gen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.controlsfx.control.StatusBar;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.GenericStyledArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.model.Codec;
import org.fxmisc.richtext.model.ReadOnlyStyledDocument;
import org.fxmisc.richtext.model.StyledDocument;
import org.fxmisc.richtext.model.StyledSegment;
import org.reactfx.util.Either;
import org.reactfx.util.Tuple2;
import richtext.LinkedImage;
import richtext.ParStyle;

import java.io.*;
import java.time.format.TextStyle;
import java.util.Arrays;

public class Controller {
    @FXML private Button runBtn;
    @FXML private CodeArea codeArea;
    @FXML private TextArea consoleArea;
    @FXML private AnchorPane bottomAnchor;
    @FXML private AnchorPane topAnchor;
    @FXML private SplitPane splitPane;
    @FXML private StatusBar statusBar;

    @FXML public void initialize(){
        // add line numbers to the left of area
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        codeArea.prefWidthProperty().bind(topAnchor.widthProperty());
        codeArea.prefHeightProperty().bind(topAnchor.heightProperty());

        consoleArea.setEditable(false);
        consoleArea.setFocusTraversable(false);

        consoleArea.prefWidthProperty().bind(bottomAnchor.widthProperty());
        consoleArea.prefHeightProperty().bind(bottomAnchor.heightProperty());

        splitPane.setDividerPositions(0.8);
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
//        Main.getInstance().failNotif("Scan","Function not implemented yet");
        EzBrewLexer lexer = new EzBrewLexer(new ANTLRInputStream(codeArea.getText()));
        Vocabulary vocabulary = lexer.getVocabulary();
        clearConsole();

        consoleLog("----------Tokens----------");
        int count = 0;
        int ws_count = 0;
        int valid_count = 0;
        for (Token token: lexer.getAllTokens()){
            String tokenClass = null;
            String symbolicName = vocabulary.getSymbolicName(token.getType());

            if (symbolicName.contains("COMMENT")){
                tokenClass = "COMMENT";
            } else if (symbolicName.contains("IDENTIFIER")) {
                tokenClass = "IDENTIFIER";
            } else if (symbolicName.contains("LITERAL")) {
                tokenClass = "LITERAL";
            } else if (token.getType() >= 49 && token.getType() <= 57) {
                tokenClass = "SEPARATOR";
            } else if (token.getType() >= 58 && token.getType() <= 93) {
                tokenClass = "OPERATOR";
            } else if (token.getType() >= 1 && token.getType() <= 38){
                tokenClass = "KEYWORD";
            } else if (symbolicName.contains("WS")) {
                ws_count++;
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
        updateStatus(count + " tokens found ("+ws_count+" whitespace tokens, " + valid_count + " valid tokens)");
    }

    public void onParseClick(ActionEvent actionEvent) {
        Main.getInstance().failNotif("Parse","Function not implemented yet");
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
        Main.getInstance().failNotif("Options","Function not implemented yet");
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
