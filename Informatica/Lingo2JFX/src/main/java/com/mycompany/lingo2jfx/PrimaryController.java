package com.mycompany.lingo2jfx;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;

public class PrimaryController {
    
    private Scanner tastiera = new Scanner(System.in);
    
    private String tentativo;
    
    private String Parola;
    
    private estraiParolaDaFile p=new estraiParolaDaFile();
    
    private String copy;
    
    private int dimParola = 8;
    
    private ArrayList<CellField> a = new ArrayList<>();
     
    private ArrayList<CellField> b = new ArrayList<>();
    
    private ArrayList<CellField> c = new ArrayList<>();
    
    private ArrayList<CellField> d = new ArrayList<>();

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnCanc"
    private Button btnCanc; // Value injected by FXMLLoader

    @FXML // fx:id="btnInvio"
    private Button btnInvio; // Value injected by FXMLLoader

    @FXML // fx:id="tfTesto"
    private TextField tfTesto; // Value injected by FXMLLoader

    @FXML // fx:id="gridPane"
    private GridPane gridPane; // Value injected by FXMLLoader
    
    @FXML
    private GridPane gridPane1;
   
    @FXML
    void handleTastieraFisica(ActionEvent event) {
        formattazioneTastieraFisica();
    }

    @FXML
    void handleTstieraSuSchermo(ActionEvent event) {
        formattazioneTastieraSuSchermo();
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
            a.get(i).setText(tfTesto.getText(i, i + 1));
        } else {
            a.get(i).setText(""); // vuoto se non c'è lettera
        }
    }
    }

    @FXML
    void handleInvio(ActionEvent event) {
        
        System.out.println("invio");
        
       
            tentativo = tfTesto.getText();
           
            
            boolean[] letteraUsata = new boolean[dimParola];
             
            if (tentativo.equals(Parola)) {
                for(int i=0; i<dimParola; i++){
                    a.get(i).cellaVerde();
                }
                
           } else {

                //strike
                for (int i = 0; i < dimParola; i++) {
                    if (tentativo.charAt(i) == Parola.charAt(i)) {
                        a.get(i).setStyle("-fx-background-color: #98FF98; -fx-border-color: black;");  
                        letteraUsata[i] = true;
                    }
                }

                //ball
                for (int i = 0; i < dimParola; i++) {
                    if (!a.get(i).getStyle().contains("#98FF98")) {
                        for (int j = 0; j < dimParola; j++) {
                            if (!letteraUsata[j] && tentativo.charAt(i) == Parola.charAt(j)) {
                                a.get(i).setStyle("-fx-background-color: #FFD700; -fx-border-color: black;");
                                letteraUsata[j] = true;
                                break;
                            }
                        }
                    }
                } 
                
                //sbagliato
                for (int i = 0; i < dimParola; i++) {
                    if (!a.get(i).getStyle().contains("#98FF98") && !a.get(i).getStyle().contains("#FFD700")) {
                        a.get(i).setStyle("-fx-background-color: #FF6347; -fx-border-color: black;");
                    }
                }
            }    
            
            tfTesto.setText("");
            tentativo="";
            for(int i=0; i<dimParola; i++){
                letteraUsata[i]=false;
            }
    }
    
    @FXML
    void handleReset(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnCanc != null : "fx:id=\"btnCanc\" was not injected: check your FXML file 'primary.fxml'.";
        assert btnInvio != null : "fx:id=\"btnInvio\" was not injected: check your FXML file 'primary.fxml'.";
        assert tfTesto != null : "fx:id=\"tfTesto\" was not injected: check your FXML file 'primary.fxml'.";
        assert gridPane != null : "fx:id=\"gridPane\" was not injected: check your FXML file 'primary.fxml'.";
        assert gridPane1 != null : "fx:id=\"gridPane1\" was not injected: check your FXML file 'primary.fxml'.";
        
       Parola=p.generaParola("1000_parole_italiane_comuni.txt", dimParola);
       System.out.println(Parola);
       
       //inizializzo array per le label e il gridPane1
       inizializzaArray();
       
       //formattazione tastiera
       formattazioneTastiera();
        
        //tasto invio disabilitato
        btnInvio.setDisable(true);
        
        //etichetta testo prende solo i caratteri minuscoli
        soloCaratteriMinuscoli();  
        
         //setta contorno e colore delle caselle    
        formattazioneCelle();
        
        //listener
        tfTesto.textProperty().addListener((obs,oldVal,newVal)-> {
            
        //limite di 5 caratteri e abilita bottone invio a 5 caratteri
        if(newVal.length() > dimParola){
            tfTesto.setText(newVal.substring(0, dimParola));
            return;
        }else{
            if(newVal.length() == dimParola){
            btnInvio.setDisable(false);
            }else{
            btnInvio.setDisable(true);
            }
                
        //metto le lettere nelle caselle 
        for (int i = 0; i < dimParola; i++) {
            if (i < newVal.length()) {
                a.get(i).setText(String.valueOf(newVal.charAt(i)));
        } else {
                a.get(i).setText("");
        }
                }
        }
    });
        
        //tasto invio tastiera
        tastoInvio();
         
    }
    
    
    //********METODI***********//
    
    private void inizializzaArray(){

    int righe = 4;
    int colonne = dimParola;

    // pulizia
    gridPane1.getChildren().clear();
    a.clear();
    b.clear();
    c.clear();
    d.clear();

    // dimensione griglia 
    gridPane1.setPrefSize(265, 240);

    // spaziatura
    gridPane1.setHgap(5);
    gridPane1.setVgap(5);
    gridPane1.setAlignment(Pos.CENTER);

    // reset constraints
    gridPane1.getColumnConstraints().clear();
    gridPane1.getRowConstraints().clear();

    // colonne
    for (int i = 0; i < colonne; i++) {
        ColumnConstraints col = new ColumnConstraints();
        col.setPercentWidth(100.0 / colonne);
        col.setFillWidth(true);
        gridPane1.getColumnConstraints().add(col);
    }

    // righe
    for (int i = 0; i < righe; i++) {
        RowConstraints row = new RowConstraints();
        row.setPercentHeight(100.0 / righe); //divide lo spazio in parti uguali
        row.setFillHeight(true); //ogni cella occupa tutto lo spazio
        gridPane1.getRowConstraints().add(row);
    }

    // celle
    for (int i = 0; i < righe; i++) {
        for (int cIndex = 0; cIndex < colonne; cIndex++) {

            CellField cella = new CellField();

            // riempie la cella
            cella.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

            gridPane1.add(cella, cIndex, i);

            // riempo gli array
            if(i == 0) a.add(cella);
            if(i == 1) b.add(cella);
            if(i == 2) c.add(cella);
            if(i == 3) d.add(cella);
        }
    }
    }

    
    private void formattazioneTastiera(){
       gridPane.setVisible(true);
       tfTesto.setEditable(false);
       btnInvio.setPrefSize(55, 25);
       btnInvio.setLayoutX(235);
       btnInvio.setLayoutY(462);
    }
    
    private void soloCaratteriMinuscoli(){
        tfTesto.setTextFormatter(new TextFormatter<>((change)-> {
        change.setText(change.getText().toLowerCase());
        return change;
        }));
    }
    
    private void formattazioneCelle(){
        for(int i=0; i<dimParola; i++){
        a.get(i).setStyle("-fx-background-color: #ffffff; -fx-border-color: black");
        b.get(i).setStyle("-fx-background-color: #ffffff; -fx-border-color: black");
        c.get(i).setStyle("-fx-background-color: #ffffff; -fx-border-color: black");
        d.get(i).setStyle("-fx-background-color: #ffffff; -fx-border-color: black");
        }
    }
    
    private void tastoInvio(){
        tfTesto.setOnKeyPressed(e ->{
        if(e.getCode() == KeyCode.ENTER){
            btnInvio.fire();
        }else if(e.getCode() == KeyCode.BACK_SPACE){
            handleCanc(null); //metodo del bottone Canc
    }
        });
    }
    
    private void formattazioneTastieraFisica(){
       gridPane.setVisible(false);
       tfTesto.setEditable(true);
       btnInvio.setPrefSize(180, 70);
       btnInvio.setLayoutX(62);
       btnInvio.setLayoutY(405);
       tfTesto.requestFocus();
    }
    
    private void formattazioneTastieraSuSchermo(){
       gridPane.setVisible(true);
       tfTesto.setEditable(false);
       btnInvio.setPrefSize(55, 25);
       btnInvio.setLayoutX(235);
       btnInvio.setLayoutY(462);
       tfTesto.requestFocus();
    }
}
