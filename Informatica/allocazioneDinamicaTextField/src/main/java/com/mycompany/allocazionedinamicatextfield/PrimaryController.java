package com.mycompany.allocazionedinamicatextfield;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

public class PrimaryController {
    private int dim=10;

@FXML
private HBox hbox = new HBox();

@FXML
void initialize() {
    hbox.setAlignment(Pos.CENTER);
    
    for(int i=0; i<dim; i++){
    hbox.getChildren().add(new CellField() );
    }

}
    
}
