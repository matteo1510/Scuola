
package com.mycompany.allocazionedinamicatextfield;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;

public class CellField extends TextField {

    public CellField() {
        super();

        // dimensioni predefinite
        //this.setPrefWidth(80);
        //this.setPrefHeight(40);
       // this.setStyle("-fx-background-color: #0000ff; -fx-text-fill: #ffffff");
        this.setText("_");
        this.setAlignment(Pos.CENTER);
        this.setFocusTraversable(false);
        this.setEditable(false);
    }
}
