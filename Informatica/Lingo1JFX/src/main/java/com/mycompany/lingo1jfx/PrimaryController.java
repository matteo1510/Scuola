package com.mycompany.lingo1jfx;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;

public class PrimaryController {
    
    private Scanner tastiera = new Scanner(System.in);
    
    private String tentativo;
    
    private String Parola;
    
    private estraiParolaDaFile p=new estraiParolaDaFile();
    
    private String copy;
    
    private int dimParola = 5;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
    
    private Label[] a;

    @FXML // fx:id="a1"
    private Label a1; // Value injected by FXMLLoader

    @FXML // fx:id="a2"
    private Label a2; // Value injected by FXMLLoader

    @FXML // fx:id="a3"
    private Label a3; // Value injected by FXMLLoader

    @FXML // fx:id="a4"
    private Label a4; // Value injected by FXMLLoader

    @FXML // fx:id="a5"
    private Label a5; // Value injected by FXMLLoader

    @FXML // fx:id="b1"
    private Label b1; // Value injected by FXMLLoader

    @FXML // fx:id="b2"
    private Label b2; // Value injected by FXMLLoader

    @FXML // fx:id="b3"
    private Label b3; // Value injected by FXMLLoader

    @FXML // fx:id="b4"
    private Label b4; // Value injected by FXMLLoader

    @FXML // fx:id="b5"
    private Label b5; // Value injected by FXMLLoader

    @FXML // fx:id="btnCanc"
    private Button btnCanc; // Value injected by FXMLLoader

    @FXML // fx:id="btnInvio"
    private Button btnInvio; // Value injected by FXMLLoader

    @FXML // fx:id="c1"
    private Label c1; // Value injected by FXMLLoader

    @FXML // fx:id="c2"
    private Label c2; // Value injected by FXMLLoader

    @FXML // fx:id="c3"
    private Label c3; // Value injected by FXMLLoader

    @FXML // fx:id="c4"
    private Label c4; // Value injected by FXMLLoader

    @FXML // fx:id="c5"
    private Label c5; // Value injected by FXMLLoader

    @FXML // fx:id="d1"
    private Label d1; // Value injected by FXMLLoader

    @FXML // fx:id="d2"
    private Label d2; // Value injected by FXMLLoader

    @FXML // fx:id="d3"
    private Label d3; // Value injected by FXMLLoader

    @FXML // fx:id="d4"
    private Label d4; // Value injected by FXMLLoader

    @FXML // fx:id="d5"
    private Label d5; // Value injected by FXMLLoader

    @FXML // fx:id="tfTesto"
    private TextField tfTesto; // Value injected by FXMLLoader

    @FXML // fx:id="gridPane"
    private GridPane gridPane; // Value injected by FXMLLoader
   
    @FXML
    void handleTastieraFisica(ActionEvent event) {
       gridPane.setVisible(false);
       tfTesto.setEditable(true);
       btnInvio.setPrefSize(180, 70);
       btnInvio.setLayoutX(62);
       btnInvio.setLayoutY(405);
       tfTesto.requestFocus();
    }

    @FXML
    void handleTstieraSuSchermo(ActionEvent event) {
       gridPane.setVisible(true);
       tfTesto.setEditable(false);
       btnInvio.setPrefSize(55, 25);
       btnInvio.setLayoutX(235);
       btnInvio.setLayoutY(462);
       tfTesto.requestFocus();
    }

    @FXML
    void handleBtnTastiera(ActionEvent event) {
    String lettera = ((Button) event.getSource()).getText();
    tfTesto.setText(tfTesto.getText()+lettera);
    }

   @FXML
    void handleCanc(ActionEvent event) {

        String testo = tfTesto.getText();

        if (!testo.isEmpty()) {
            tfTesto.setText(testo.substring(0, testo.length() - 1));
            
            //riposiziono il cursore
            tfTesto.positionCaret(tfTesto.getText().length());
        }
        
        //riscrivo nelle caselle
         for (int i = 0; i < dimParola; i++) {
        if (i < tfTesto.getText().length()) {
            a[i].setText(tfTesto.getText(i, i + 1));
        } else {
            a[i].setText(""); // vuoto se non c'è lettera
        }
    }
    }

    @FXML
    void handleInvio(ActionEvent event) {
        
        System.out.println("invio");
        
       
            tentativo = tfTesto.getText();
           
            
            boolean[] letteraUsata = new boolean[dimParola];
             
            if (tentativo.equals(Parola)) {
                a1.setStyle("-fx-background-color: #98FF98");
                a2.setStyle("-fx-background-color: #98FF98");
                a3.setStyle("-fx-background-color: #98FF98");
                a4.setStyle("-fx-background-color: #98FF98");
                a5.setStyle("-fx-background-color: #98FF98");
                
           } else {

                //strike
                for (int i = 0; i < dimParola; i++) {
                    if (tentativo.charAt(i) == Parola.charAt(i)) {
                        a[i].setStyle("-fx-background-color: #98FF98; -fx-border-color: black;");  
                        letteraUsata[i] = true;
                    }
                }

                //ball
                for (int i = 0; i < dimParola; i++) {
                    if (!a[i].getStyle().contains("#98FF98")) {
                        for (int j = 0; j < dimParola; j++) {
                            if (!letteraUsata[j] && tentativo.charAt(i) == Parola.charAt(j)) {
                                a[i].setStyle("-fx-background-color: #FFD700; -fx-border-color: black;");
                                letteraUsata[j] = true;
                                break;
                            }
                        }
                    }
                } 
                
                //sbagliato
                for (int i = 0; i < dimParola; i++) {
                    if (!a[i].getStyle().contains("#98FF98") && !a[i].getStyle().contains("#FFD700")) {
                        a[i].setStyle("-fx-background-color: #FF6347; -fx-border-color: black;");
                    }
                }
            }    
    }
    
    @FXML
    void handleReset(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert a1 != null : "fx:id=\"a1\" was not injected: check your FXML file 'primary.fxml'.";
        assert a2 != null : "fx:id=\"a2\" was not injected: check your FXML file 'primary.fxml'.";
        assert a3 != null : "fx:id=\"a3\" was not injected: check your FXML file 'primary.fxml'.";
        assert a4 != null : "fx:id=\"a4\" was not injected: check your FXML file 'primary.fxml'.";
        assert a5 != null : "fx:id=\"a5\" was not injected: check your FXML file 'primary.fxml'.";
        assert b1 != null : "fx:id=\"b1\" was not injected: check your FXML file 'primary.fxml'.";
        assert b2 != null : "fx:id=\"b2\" was not injected: check your FXML file 'primary.fxml'.";
        assert b3 != null : "fx:id=\"b3\" was not injected: check your FXML file 'primary.fxml'.";
        assert b4 != null : "fx:id=\"b4\" was not injected: check your FXML file 'primary.fxml'.";
        assert b5 != null : "fx:id=\"b5\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnCanc != null : "fx:id=\"btnCanc\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnInvio != null : "fx:id=\"btnInvio\" was not injected: check your FXML file 'primary.fxml'.";
        assert c1 != null : "fx:id=\"c1\" was not injected: check your FXML file 'primary.fxml'.";
        assert c2 != null : "fx:id=\"c2\" was not injected: check your FXML file 'primary.fxml'.";
        assert c3 != null : "fx:id=\"c3\" was not injected: check your FXML file 'primary.fxml'.";
        assert c4 != null : "fx:id=\"c4\" was not injected: check your FXML file 'primary.fxml'.";
        assert c5 != null : "fx:id=\"c5\" was not injected: check your FXML file 'primary.fxml'.";
        assert d1 != null : "fx:id=\"d1\" was not injected: check your FXML file 'primary.fxml'.";
        assert d2 != null : "fx:id=\"d2\" was not injected: check your FXML file 'primary.fxml'.";
        assert d3 != null : "fx:id=\"d3\" was not injected: check your FXML file 'primary.fxml'.";
        assert d4 != null : "fx:id=\"d4\" was not injected: check your FXML file 'primary.fxml'.";
        assert d5 != null : "fx:id=\"d5\" was not injected: check your FXML file 'primary.fxml'.";
        assert tfTesto != null : "fx:id=\"tfTesto\" was not injected: check your FXML file 'primary.fxml'.";
       
       Parola=p.generaParola("1000_parole_italiane_comuni.txt", dimParola);
       System.out.println(Parola);
       
       //inizializzo array a per label
       a = new Label[]{a1, a2, a3, a4, a5};
       
       //formattazione tastiera
       gridPane.setVisible(true);
       tfTesto.setEditable(false);
       btnInvio.setPrefSize(55, 25);
       btnInvio.setLayoutX(235);
       btnInvio.setLayoutY(462);
       
        
        //tasto invio disabilitato
        btnInvio.setDisable(true);
        
            //etichetta testo prende solo i caratteri minuscoli
            tfTesto.setTextFormatter(new TextFormatter<>((change)-> {
            change.setText(change.getText().toLowerCase());
            return change;
        }));
        
        //listener
        tfTesto.textProperty().addListener((obs,oldVal,newVal)-> {
        
        //setta contorno e colore delle caselle    
        a1.setStyle("-fx-background-color: #ffffff");
        a2.setStyle("-fx-background-color: #ffffff");
        a3.setStyle("-fx-background-color: #ffffff");
        a4.setStyle("-fx-background-color: #ffffff");
        a5.setStyle("-fx-background-color: #ffffff");
        a1.setStyle("-fx-border-color: black");
        a2.setStyle("-fx-border-color: black");
        a3.setStyle("-fx-border-color: black");
        a4.setStyle("-fx-border-color: black");
        a5.setStyle("-fx-border-color: black");
            
            //limite di 5 caratteri e abilita bottone invio a 5 caratteri
            if(newVal.length() > 5){
                copy=newVal.substring(0, 5);
                        tfTesto.setText(copy);
            }else{
                if(newVal.length() == dimParola){
                btnInvio.setDisable(false);
                }else{
                btnInvio.setDisable(true);
                }
                
        //metto le lettere nelle caselle 
        try{
            a1.setText(tfTesto.getText(0,1));
            a2.setText(tfTesto.getText(1,2));
            a3.setText(tfTesto.getText(2,3));
            a4.setText(tfTesto.getText(3,4));
            a5.setText(tfTesto.getText(4,5));
        }catch(IndexOutOfBoundsException e){}
        }
    });
        
        //tasto invio tastiera
         tfTesto.setOnKeyPressed(e ->{
            if(e.getCode() == KeyCode.ENTER){
                btnInvio.fire();
            }else if(e.getCode() == KeyCode.BACK_SPACE){
                handleCanc(null); //metodo del bottone Canc
}
//            else if(e.getCode() == KeyCode.BACK_SPACE){ //tasto cancella
//                if(tfTesto.getText().length() < 5){
//                    a1.setText(" ");
//                    a2.setText(" ");
//                    a3.setText(" ");
//                    a4.setText(" ");
//                    a5.setText(" ");
//                    
//        try{
//            a1.setText(tfTesto.getText(0,1));
//            a2.setText(tfTesto.getText(1,2));
//            a3.setText(tfTesto.getText(2,3));
//            a4.setText(tfTesto.getText(3,4));
//            a5.setText(tfTesto.getText(4,5));
//        }catch(IndexOutOfBoundsException ex){}
//                }
//            }
        });
         
    }

}
