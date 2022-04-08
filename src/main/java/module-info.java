module studio.rrprojects.sr3echarman {
    requires javafx.controls;
    requires javafx.fxml;


    opens studio.rrprojects.sr3echarman to javafx.fxml;
    exports studio.rrprojects.sr3echarman;
}