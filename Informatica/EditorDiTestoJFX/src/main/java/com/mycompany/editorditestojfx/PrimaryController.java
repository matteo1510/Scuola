package com.mycompany.editorditestojfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class PrimaryController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnBold"
    private Button btnBold; // Value injected by FXMLLoader

    @FXML // fx:id="btnCarica"
    private MenuItem btnCarica; // Value injected by FXMLLoader

    @FXML // fx:id="btnFile"
    private MenuButton btnFile; // Value injected by FXMLLoader

    @FXML // fx:id="btnGeneraParola"
    private Button btnGeneraParola; // Value injected by FXMLLoader

    @FXML // fx:id="btnItalic"
    private Button btnItalic; // Value injected by FXMLLoader

    @FXML // fx:id="btnSalva"
    private MenuItem btnSalva; // Value injected by FXMLLoader

    @FXML
    void handleBold(ActionEvent event) {

    }

    @FXML
    void handleCarica(ActionEvent event) {

    }

   // @FXML
    //void handleFile(ActionEvent event) {

    //}

    @FXML
    void handleGeneraParola(ActionEvent event) {

    }

    @FXML
    void handleItalic(ActionEvent event) {

    }

    @FXML
    void handleSalva(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnBold != null : "fx:id=\"btnBold\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnCarica != null : "fx:id=\"btnCarica\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnFile != null : "fx:id=\"btnFile\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnGeneraParola != null : "fx:id=\"btnGeneraParola\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnItalic != null : "fx:id=\"btnItalic\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnSalva != null : "fx:id=\"btnSalva\" was not injected: check your FXML file 'primary.fxml'.";

    }

}
