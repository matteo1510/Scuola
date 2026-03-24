package com.mycompany.lingo3jfx;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;

public class CellField extends TextField {

    public CellField() {
        super();
        this.setText("_");
        this.setAlignment(Pos.CENTER);
        this.setFocusTraversable(false);
        this.setEditable(false);
    }
    
    public void cellaVerde(){
        setStyle("-fx-background-color: #98FF98");
    }
    
     public void cellaGialla(){
        setStyle("-fx-background-color:#FFD700; -fx-border-color:black;");
    }

    public void cellaRossa(){
        setStyle("-fx-background-color:#FF6347; -fx-border-color:black;");
    }
}
