package studio.rrprojects.sr3echarman;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    public static String Title = "Shadowrun 3rd Edition Character Manager";

    @FXML
    private Label welcomeText;


    public void createNewCharacter(ActionEvent actionEvent) {
        System.out.println("Creating A New Character:");
    }

    public void createRandomCharacter(ActionEvent actionEvent) {

    }

    public void loadCharacter(ActionEvent actionEvent) {
    }
}
