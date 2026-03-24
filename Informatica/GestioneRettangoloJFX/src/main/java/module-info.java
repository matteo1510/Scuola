module com.mycompany.gestionerettangolojfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.gestionerettangolojfx to javafx.fxml;
    exports com.mycompany.gestionerettangolojfx;
}
