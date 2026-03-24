package com.mycompany.provabinding;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class PrimaryController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txt1"
    private TextField txt1; // Value injected by FXMLLoader

    @FXML // fx:id="txt2"
    private TextField txt2; // Value injected by FXMLLoader
    
    @FXML // fx:id="txt3"
    private TextField txt3; // Value injected by FXMLLoader
    
        @FXML // fx:id="pb1"
    private ProgressBar pb1; // Value injected by FXMLLoader

    @FXML // fx:id="sld1"
    private Slider sld1; // Value injected by FXMLLoader
    
    @FXML
    private Button btn1;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txt1 != null : "fx:id=\"txt1\" was not injected: check your FXML file 'primary.fxml'.";
        assert txt2 != null : "fx:id=\"txt2\" was not injected: check your FXML file 'primary.fxml'.";
        assert txt3 != null : "fx:id=\"txt3\" was not injected: check your FXML file 'primary.fxml'.";
        assert btn1 != null : "fx:id=\"btn1\" was not injected: check your FXML file 'primary.fxml'.";
        assert pb1 != null : "fx:id=\"pb1\" was not injected: check your FXML file 'primary.fxml'.";
        assert sld1 != null : "fx:id=\"sld1\" was not injected: check your FXML file 'primary.fxml'.";


        txt1.textProperty().bindBidirectional(txt2.textProperty());
        btn1.disableProperty().bind(txt1.textProperty().isEmpty().or(txt3.textProperty().isEmpty()));
        
        sld1.valueProperty().addListener(new ChangeListener<Number>(){
        
        @Override
        public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue){
            double volume=newValue.doubleValue();
            pb1.setProgress(volume/100);
        }
    
      });
    }
    
    @FXML
    void handleButton(ActionEvent event) {

    }
  }

