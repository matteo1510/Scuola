module com.mycompany.lingojfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lingojfx to javafx.fxml;
    exports com.mycompany.lingojfx;
}
