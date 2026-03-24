module com.mycompany.provabinding {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.provabinding to javafx.fxml;
    exports com.mycompany.provabinding;
}
