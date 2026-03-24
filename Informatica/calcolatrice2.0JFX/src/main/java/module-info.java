module com.mycompany.calcolatrice2.jfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.calcolatrice2.jfx to javafx.fxml;
    exports com.mycompany.calcolatrice2.jfx;
}
