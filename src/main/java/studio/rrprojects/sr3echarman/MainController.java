package studio.rrprojects.sr3echarman;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    public static String Title = "Shadowrun 3rd Edition Character Manager";

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hello World!");
    }
}
