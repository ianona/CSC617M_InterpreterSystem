package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import org.controlsfx.control.Notifications;

public class Main extends Application {
    private static Main instance;
    private static String mode;

    private Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.instance = this;

        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        Constants.SCREEN_HEIGHT = (int) (primaryScreenBounds.getHeight() * 0.85);
        Constants.SCREEN_WIDTH = (int) (primaryScreenBounds.getWidth() * 0.85);
        primaryStage.setTitle(Constants.APP_NAME);

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setScene(new Scene(root, Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT));
        primaryStage.show();
        primaryStage.setResizable(false);

        primaryStage.getScene().getStylesheets().add(
                this.getClass().getResource("common-style.css").toExternalForm()
        );

        primaryStage.getScene().getStylesheets().add(
                this.getClass().getResource("light-mode.css").toExternalForm()
        );

//        boolean x;
//        if(x = 0) {
//            x = 1;
//        }

        // set current IDE mode
        mode = Constants.MODE_LIGHT;
    }

    public static Main getInstance() {
        return instance;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void successNotif(String title, String body){
        Notifications.create().title(title + " Success").text(body).position(Pos.BOTTOM_RIGHT).owner(primaryStage).showInformation();
    }

    public void failNotif(String title, String body){
        Notifications.create().title(title + " Fail").text(body).position(Pos.BOTTOM_RIGHT).owner(primaryStage).showError();
    }

    public Stage getPrimaryStage(){
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
