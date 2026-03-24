package com.mycompany.aziendajfx;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnCancella"
    private Button btnCancella; // Value injected by FXMLLoader

    @FXML // fx:id="btnInvia"
    private Button btnInvia; // Value injected by FXMLLoader

    @FXML // fx:id="lbl1"
    private AnchorPane lbl1; // Value injected by FXMLLoader
    
    @FXML // fx:id="lblRisultato"
    private Label lblRisultato; // Value injected by FXMLLoader

    @FXML // fx:id="textField"
    private TextField textField; // Value injected by FXMLLoader
    
    @FXML // fx:id="textFieldNome"
    private TextField textFieldNome; // Value injected by FXMLLoader

     @FXML // fx:id="TextFieldStipendio"
    private TextField TextFieldStipendio; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert TextFieldStipendio != null : "fx:id=\"TextFieldStipendio\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnInvia != null : "fx:id=\"btnInvia\" was not injected: check your FXML file 'primary.fxml'.";
        assert lbl1 != null : "fx:id=\"lbl1\" was not injected: check your FXML file 'primary.fxml'.";
        assert lblRisultato != null : "fx:id=\"lblRisultato\" was not injected: check your FXML file 'primary.fxml'.";
        assert textField != null : "fx:id=\"textField\" was not injected: check your FXML file 'primary.fxml'.";
        assert textFieldNome != null : "fx:id=\"textFieldNome\" was not injected: check your FXML file 'primary.fxml'.";
    }
    @FXML
    public void calcola(ActionEvent event){
        Dipendente d1=new Dipendente(this.textFieldNome.getText(),Integer.parseInt(this.TextFieldStipendio.getText()));
        int p;
     
        p = Integer.parseInt(this.textField.getText());
        lblRisultato.setText("Lo stipendio aumentato è: "+String.valueOf(d1.aumentoStipendio(p))+"€");   
        
    }
    
       @FXML
    void cancella(ActionEvent event) {
        lblRisultato.setText("");
        textField.setText("");
        TextFieldStipendio.setText("");
        textFieldNome.setText("");
    }
}