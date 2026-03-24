module com.mycompany.rubricajfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.rubricajfx to javafx.fxml;
    exports com.mycompany.rubricajfx;
}
