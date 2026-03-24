package com.mycompany.rubricajfx;


package com.mycompany.rubricajfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SecondaryController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnIndietro"
    private Button btnIndietro; // Value injected by FXMLLoader

    @FXML // fx:id="btnSalva"
    private Button btnSalva; // Value injected by FXMLLoader

    @FXML // fx:id="lblCellulare"
    private Label lblCellulare; // Value injected by FXMLLoader

    @FXML // fx:id="lblEmail"
    private Label lblEmail; // Value injected by FXMLLoader

    @FXML // fx:id="lblMessaggio"
    private Label lblMessaggio; // Value injected by FXMLLoader

    @FXML // fx:id="lblNome"
    private Label lblNome; // Value injected by FXMLLoader

    @FXML
    void handleIndietro(ActionEvent event) {

    }

    @FXML
    void handleSalva(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnIndietro != null : "fx:id=\"btnIndietro\" was not injected: check your FXML file 'secondary.fxml'.";
        assert btnSalva != null : "fx:id=\"btnSalva\" was not injected: check your FXML file 'secondary.fxml'.";
        assert lblCellulare != null : "fx:id=\"lblCellulare\" was not injected: check your FXML file 'secondary.fxml'.";
        assert lblEmail != null : "fx:id=\"lblEmail\" was not injected: check your FXML file 'secondary.fxml'.";
        assert lblMessaggio != null : "fx:id=\"lblMessaggio\" was not injected: check your FXML file 'secondary.fxml'.";
        assert lblNome != null : "fx:id=\"lblNome\" was not injected: check your FXML file 'secondary.fxml'.";

    }

}
