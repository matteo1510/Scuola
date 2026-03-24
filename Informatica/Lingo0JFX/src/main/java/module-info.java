module com.mycompany.lingo0jfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lingo0jfx to javafx.fxml;
    exports com.mycompany.lingo0jfx;
}
