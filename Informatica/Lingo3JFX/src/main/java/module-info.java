module com.mycompany.lingo3jfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lingo3jfx to javafx.fxml;
    exports com.mycompany.lingo3jfx;
}
