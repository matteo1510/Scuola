/**
 * Sample Skeleton for 'primary.fxml' Controller Class
 */

package com.mycompany.rubricajfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnAggiungi"
    private Button btnAggiungi; // Value injected by FXMLLoader

    @FXML // fx:id="btnCanc"
    private Button btnCanc; // Value injected by FXMLLoader

    @FXML // fx:id="btnRubrica"
    private Button btnRubrica; // Value injected by FXMLLoader

    @FXML // fx:id="btnTastiera"
    private Button btnTastiera; // Value injected by FXMLLoader

    @FXML
    void handleAggiungi(ActionEvent event) {

    }

    @FXML
    void handleCanc(ActionEvent event) {

    }

    @FXML
    void handleRubrica(ActionEvent event) {

    }

    @FXML
    void handleTastiera(ActionEvent event) {

    }

    @FXML
    void hndleNumeri(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnAggiungi != null : "fx:id=\"btnAggiungi\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnCanc != null : "fx:id=\"btnCanc\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnRubrica != null : "fx:id=\"btnRubrica\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnTastiera != null : "fx:id=\"btnTastiera\" was not injected: check your FXML file 'primary.fxml'.";

    }

}
