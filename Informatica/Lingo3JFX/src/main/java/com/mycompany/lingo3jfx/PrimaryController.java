package com.mycompany.lingo3jfx;

/**
 * Sample Skeleton for 'primary.fxml' Controller Class
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

public class PrimaryController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
    
    @FXML
    private GridPane gridPane1;
    
    private int dimParola = 6;
    
    private Scanner tastiera = new Scanner(System.in);
    
    private ArrayList<CellField> a = new ArrayList<>();
     
    private ArrayList<CellField> b = new ArrayList<>();
    
    private ArrayList<CellField> c = new ArrayList<>();
    
    private ArrayList<CellField> d = new ArrayList<>();

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        
        for(int i=0; i<dimParola; i++){
        CellField cella = new CellField();
        a.add(cella);
        gridPane1.add(cella,0,0);
       }
       
      
       for(int i=0; i<dimParola; i++){
        CellField cella = new CellField();
        b.add(cella);
        gridPane1.add(cella,i,1);
       }
      
       for(int i=0; i<dimParola; i++){
        CellField cella = new CellField();
        c.add(cella);
        gridPane1.add(cella,i,2);
       }
       
       
       for(int i=0; i<dimParola; i++){
        CellField cella = new CellField();
        d.add(cella);
        gridPane1.add(cella,i,3);
       }
       
    }

}