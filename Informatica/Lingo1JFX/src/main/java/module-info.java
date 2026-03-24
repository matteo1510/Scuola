module com.mycompany.lingo1jfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lingo1jfx to javafx.fxml;
    exports com.mycompany.lingo1jfx;
}
