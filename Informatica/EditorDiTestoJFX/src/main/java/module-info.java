module com.mycompany.editorditestojfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.editorditestojfx to javafx.fxml;
    exports com.mycompany.editorditestojfx;
}
