module com.mycompany.indovinanumero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.indovinanumero to javafx.fxml;
    exports com.mycompany.indovinanumero;
}
