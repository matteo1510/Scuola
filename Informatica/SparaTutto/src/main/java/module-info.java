module com.mycompany.sparatutto {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.sparatutto to javafx.fxml;
    exports com.mycompany.sparatutto;
}
