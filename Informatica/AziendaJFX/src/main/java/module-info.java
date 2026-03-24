module com.mycompany.aziendajfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.aziendajfx to javafx.fxml;
    exports com.mycompany.aziendajfx;
}
