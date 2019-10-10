package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.StyleClassedTextArea;
import org.fxmisc.richtext.StyledTextArea;

public class Controller {
    @FXML private Button runBtn;
    @FXML private CodeArea codeArea;

    @FXML public void initialize(){
        // add line numbers to the left of area
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
    }

    public void onRunClick(ActionEvent actionEvent) {
        System.out.println(codeArea.getText());
        System.out.println("-------");
        Main.getInstance().successNotif("Run","View console for retrieved text");
    }


}
