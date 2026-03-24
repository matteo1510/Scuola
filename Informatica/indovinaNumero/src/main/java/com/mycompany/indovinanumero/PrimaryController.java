package com.mycompany.indovinanumero;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;


import java.util.Random;

public class PrimaryController {

    @FXML
    private TextField inputNumero;

    @FXML
    private Label labelMessaggio;

    @FXML
    private Label labelTentativi;

    @FXML
    private Button btnInvia;
    
    @FXML
    private ListView<String> listaCronologia;

    private int numeroCasuale;
    private int tentativi = 5;

    public void initialize() {
        Random rand = new Random();
        numeroCasuale = rand.nextInt(100) + 1;
        labelTentativi.setText("Tentativi rimasti: " + tentativi);
        labelMessaggio.setText("Inserisci un numero tra 1 e 100");
    }

    @FXML
private void controllaNumero() {
    if (tentativi == 0) return;

    try {
        int tentativo = Integer.parseInt(inputNumero.getText());

        String voceCronologia;

        if (tentativo == numeroCasuale) {
            voceCronologia = tentativo + " → CORRETTO";
            listaCronologia.getItems().add(voceCronologia);

            labelMessaggio.setText("Hai indovinato! Il numero era " + numeroCasuale);
            btnInvia.setDisable(true);
            return;
        }

        if (tentativo > numeroCasuale) {
            labelMessaggio.setText("Troppo alto (" + tentativo + ")");
            voceCronologia = tentativo + " → troppo alto";
        } else {
            labelMessaggio.setText("Troppo basso (" + tentativo + ")");
            voceCronologia = tentativo + " → troppo basso";
        }

        listaCronologia.getItems().add(voceCronologia);

        tentativi--;
        labelTentativi.setText("Tentativi rimasti: " + tentativi);

        if (tentativi == 0) {
            labelMessaggio.setText("Hai perso! Il numero era " + numeroCasuale);
            btnInvia.setDisable(true);
        }

    } catch (NumberFormatException e) {
        labelMessaggio.setText("Inserisci un numero valido");
    }

    inputNumero.clear();
}

}