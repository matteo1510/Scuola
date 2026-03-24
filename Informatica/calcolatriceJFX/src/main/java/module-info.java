module com.mycompany.calcolatricejfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.calcolatricejfx to javafx.fxml;
    exports com.mycompany.calcolatricejfx;
}
