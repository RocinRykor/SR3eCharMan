package studio.rrprojects.sr3echarman;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("MainView.fxml")));
        Scene scene = new Scene(root);
        Image icon = new Image(Objects.requireNonNull(Main.class.getResource("icon.png")).toURI().toString());
        String css = this.getClass().getResource("Application.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.getIcons().add(icon);
        stage.setTitle(MainController.Title);
        stage.setScene(scene);
        stage.show();
    }
}
