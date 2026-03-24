module com.mycompany.allocazionedinamicatextfield {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.allocazionedinamicatextfield to javafx.fxml;
    exports com.mycompany.allocazionedinamicatextfield;
}
