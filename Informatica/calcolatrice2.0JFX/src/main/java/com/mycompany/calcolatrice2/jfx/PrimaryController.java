package com.mycompany.calcolatrice2.jfx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {
    private double valoreCorrente = 0;
    private String operazione = "";
    private boolean nuovoNumero = true;
    private double secondoNumero;
    private boolean percento=false;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="lblCronologia"
    private Label lblCronologia; // Value injected by FXMLLoader

    @FXML // fx:id="lblRisultato"
    private Label lblRisultato; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert lblCronologia != null : "fx:id=\"lblCronologia\" was not injected: check your FXML file 'primary.fxml'.";
        assert lblRisultato != null : "fx:id=\"lblRisultato\" was not injected: check your FXML file 'primary.fxml'.";

    }
    
        @FXML
void handleNumeri(ActionEvent event) {
    String numero = ((Button) event.getSource()).getText();

    // blocca doppio punto
    if (numero.equals(".") && lblRisultato.getText().contains(".")) {
        return;
    }

    if (nuovoNumero) {
        if (numero.equals(".")) {
            lblRisultato.setText("0.");
        } else {
            lblRisultato.setText(numero);
        }
        nuovoNumero = false;
    } else {
         if (lblRisultato.getText().length() <= 9){
        lblRisultato.setText(lblRisultato.getText() + numero);
         }
    }
}
 

    @FXML
void handleOperazioni(ActionEvent event) {
    String opPremuta = ((Button) event.getSource()).getText();

    // segno meno
    if (opPremuta.equals("-") && nuovoNumero) {
        lblRisultato.setText("-");
        nuovoNumero = false;
        return;
    }

    // multi-operazione
    if (!operazione.isEmpty()) {
        handleUguale(null);
    }

    valoreCorrente = Double.parseDouble(lblRisultato.getText());
    operazione = opPremuta;
    nuovoNumero = true;

    lblCronologia.setText(formatNumero(valoreCorrente) + " " + operazione);
}


    @FXML
void handleUguale(ActionEvent event) {
    if (operazione.isEmpty()) return;

    secondoNumero = Double.parseDouble(lblRisultato.getText());

    switch (operazione) {
        case "+":
            valoreCorrente += secondoNumero;
            break;
        case "-":
            valoreCorrente -= secondoNumero;
            break;
        case "*":
            valoreCorrente *= secondoNumero;
            break;
        case "/":
            if (secondoNumero == 0) {
                lblRisultato.setText("Errore");
                operazione = "";
                return;
            }
            valoreCorrente /= secondoNumero;
            break;
    }
if(!percento){
    lblCronologia.setText(lblCronologia.getText() + " " + formatNumero(secondoNumero) + " =");
    lblRisultato.setText(formatNumero(valoreCorrente));
}else{
    lblCronologia.setText(lblCronologia.getText() + " =");
    lblRisultato.setText(formatNumero(valoreCorrente));
}
    operazione = "";
    nuovoNumero = true;
    percento=false;
}

@FXML
void handlePercento(ActionEvent event) {
secondoNumero=Double.parseDouble(lblRisultato.getText());
   switch (operazione) {
        case "+":
        case "-":
            secondoNumero = valoreCorrente * secondoNumero / 100;
            break;

        case "*":
        case "/":
            secondoNumero = secondoNumero / 100;
            break;
   }
    lblCronologia.setText(lblCronologia.getText() + " " + formatNumero(secondoNumero));
    lblRisultato.setText(formatNumero(secondoNumero));
    percento=true;
}
    
@FXML
void handleCanc(ActionEvent event) {
    lblRisultato.setText("0");
    lblCronologia.setText("");
    valoreCorrente = 0;
    operazione = "";
    nuovoNumero = true;
    percento=false;
}

@FXML
void handleCE(ActionEvent event) {
    lblRisultato.setText("");
}

private String formatNumero(double numero) {
    if (numero == (long) numero) {
        return String.valueOf((long) numero);
    } else {
        return String.valueOf(numero);
    }
}

}
