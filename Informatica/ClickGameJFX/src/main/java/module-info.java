module com.mycompany.clickgamejfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.clickgamejfx to javafx.fxml;
    exports com.mycompany.clickgamejfx;
}
