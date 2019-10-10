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
    }

    public static Main getInstance() {
        return instance;
    }

    public void successNotif(String title, String body){
        Notifications.create().title(title + " Success").text(body).position(Pos.BOTTOM_RIGHT).owner(primaryStage).showInformation();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
