package com.mycompany.lingo0jfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyCode;

public class PrimaryController {
    
    private int dimParola = 5;
    
    private String copy;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="a1"
    private TextField a1; // Value injected by FXMLLoader

    @FXML // fx:id="a2"
    private TextField a2; // Value injected by FXMLLoader

    @FXML // fx:id="a3"
    private TextField a3; // Value injected by FXMLLoader

    @FXML // fx:id="a4"
    private TextField a4; // Value injected by FXMLLoader

    @FXML // fx:id="a5"
    private TextField a5; // Value injected by FXMLLoader

    @FXML // fx:id="btnGioca"
    private Button btnGioca; // Value injected by FXMLLoader

    @FXML // fx:id="tfGiocata"
    private TextField tfGiocata; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert a1 != null : "fx:id=\"a1\" was not injected: check your FXML file 'primary.fxml'.";
        assert a2 != null : "fx:id=\"a2\" was not injected: check your FXML file 'primary.fxml'.";
        assert a3 != null : "fx:id=\"a3\" was not injected: check your FXML file 'primary.fxml'.";
        assert a4 != null : "fx:id=\"a4\" was not injected: check your FXML file 'primary.fxml'.";
        assert a5 != null : "fx:id=\"a5\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnGioca != null : "fx:id=\"btnGioca\" was not injected: check your FXML file 'primary.fxml'.";
        assert tfGiocata != null : "fx:id=\"tfGiocata\" was not injected: check your FXML file 'primary.fxml'.";

        btnGioca.setDisable(true);
        
        tfGiocata.setTextFormatter(new TextFormatter<>((change)-> {
            change.setText(change.getText().toLowerCase());
            return change;
        }));
        
        tfGiocata.textProperty().addListener((obs,oldVal,newVal)-> {
         a1.setStyle("-fx-background-color: #0000ff");
         a2.setStyle("-fx-background-color: #0000ff");
         a3.setStyle("-fx-background-color: #0000ff");
         a4.setStyle("-fx-background-color: #0000ff");
         a5.setStyle("-fx-background-color: #0000ff");
            
            if(newVal.length() > 5){
                copy=newVal.substring(0, 5);
                        tfGiocata.setText(copy);
            }else{
                if(newVal.length() == dimParola){
                btnGioca.setDisable(false);
                }else{
                btnGioca.setDisable(true);
                }
            
        try{
            a1.setText(tfGiocata.getText(0,1));
            a2.setText(tfGiocata.getText(1,2));
            a3.setText(tfGiocata.getText(2,3));
            a4.setText(tfGiocata.getText(3,4));
            a5.setText(tfGiocata.getText(4,5));
        }catch(IndexOutOfBoundsException e){}
        
            }
    });
        
        tfGiocata.setOnKeyPressed(e ->{
            if(e.getCode() == KeyCode.ENTER){
                btnGioca.fire();
            }else if(e.getCode() == KeyCode.BACK_SPACE){
                if(tfGiocata.getText().length() < 5){
                 
                    a1.setText("-");
                    a2.setText("-");
                    a3.setText("-");
                    a4.setText("-");
                    a5.setText("-");
                    
        try{
            a1.setText(tfGiocata.getText(0,1));
            a2.setText(tfGiocata.getText(1,2));
            a3.setText(tfGiocata.getText(2,3));
            a4.setText(tfGiocata.getText(3,4));
            a5.setText(tfGiocata.getText(4,5));
        }catch(IndexOutOfBoundsException ex){}
                }
            }
        });
        
    }
    
    @FXML
    void handleGioca(ActionEvent event) {
        System.out.println("ciao");
    }

}
