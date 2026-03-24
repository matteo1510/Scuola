package com.mycompany.gestionerettangolojfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ViewController {

    //oggetto di classe rettangolo
    Rettangolo r;
    
    //dichiarazione attributi
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCalcola;

    @FXML
    private Button btnCancella;

    @FXML
    private Label lblCorto;

    @FXML
    private Label lblLungo;

    @FXML
    private TextArea txtArea;

    @FXML
    private TextField txtLatocorto;

    @FXML
    private TextField txtLatolungo;
    
   ///////////////////////////////////////////////////////////////////////////////////////
    
    //funzione btn calcola
    @FXML
    void calcola(ActionEvent event)
    {
        
        //Faccio prima una serie di controlli sulla correttezza dei dati inseriti
        
        if (this.txtLatocorto.getText().isBlank()){
            return;
        }

        if (this.txtLatolungo.getText().isBlank()){
            return;
        }

        if (!this.txtLatolungo.getText().matches("[0-9]+")){
            return;
        }

        if (!this.txtLatocorto.getText().matches("[0-9]+")){
            return;
        }

        double latoLungo = Double.valueOf(this.txtLatolungo.getText());
        double latoCorto = Double.valueOf(this.txtLatocorto.getText());

        this.lblLungo.setText(this.txtLatolungo.getText());
        this.lblCorto.setText(this.txtLatocorto.getText());

        r = new Rettangolo(latoLungo, latoCorto);
        
        this.txtArea.setText( "Area=" + r.area() + "\n" +
                              "Perimetro= " + r.perimetro() + "\n" +
                              "Diagonale= " + r.diagonale()  );

    }

    //funzione btn cancella
    @FXML
    void cancella(ActionEvent event)
    {
        this.lblLungo.setText("");
        this.lblCorto.setText("");
        this.txtArea.setText("");
        this.txtLatocorto.setText("");
        this.txtLatolungo.setText("");
    }

    //inizializzazione
    @FXML
    void initialize() {
        assert btnCalcola != null : "fx:id=\"btnCalcola\" was not injected: check your FXML file 'rettangolo-view.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'rettangolo-view.fxml'.";
        assert lblCorto != null : "fx:id=\"lblCorto\" was not injected: check your FXML file 'rettangolo-view.fxml'.";
        assert lblLungo != null : "fx:id=\"lblLungo\" was not injected: check your FXML file 'rettangolo-view.fxml'.";
        assert txtArea != null : "fx:id=\"txtArea\" was not injected: check your FXML file 'rettangolo-view.fxml'.";
        assert txtLatocorto != null : "fx:id=\"txtLatocorto\" was not injected: check your FXML file 'rettangolo-view.fxml'.";
        assert txtLatolungo != null : "fx:id=\"txtLatolungo\" was not injected: check your FXML file 'rettangolo-view.fxml'.";

    }
    }    