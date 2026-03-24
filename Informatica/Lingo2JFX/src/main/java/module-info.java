module com.mycompany.lingo2jfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lingo2jfx to javafx.fxml;
    exports com.mycompany.lingo2jfx;
}
