package com.mycompany.lingojfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class PrimaryController {

    @FXML
    private TextField tentativoField;

    @FXML
    private Button inviaButton;

    @FXML
    private Label strikeLabel;

    @FXML
    private Label ballLabel;

    @FXML
    private Label messageLabel;

    private ArrayList<String> parole = new ArrayList<>();
    private String parolaSegreta;
    private int lunghezzaParola;
    private Random random = new Random();

    @FXML
    public void initialize() {
        // Carica le parole dal file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("words.italian.txt")));
           
            lunghezzaParola = 5; 
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.length() == lunghezzaParola) {
                    parole.add(linea.toLowerCase());
                }
            }
            reader.close();
        } catch (Exception e) {
            messageLabel.setText("Errore caricamento file: " + e.getMessage());
            inviaButton.setDisable(true);
            return;
        }

        if (parole.isEmpty()) {
            messageLabel.setText("Nessuna parola trovata!");
            inviaButton.setDisable(true);
            return;
        }

        parolaSegreta = parole.get(random.nextInt(parole.size()));
        messageLabel.setText("Inserisci un tentativo di " + lunghezzaParola + " lettere.");
    }

    @FXML
    private void handleInvia() {
        String tentativo = tentativoField.getText().toLowerCase().trim();
        if (tentativo.length() != lunghezzaParola) {
            messageLabel.setText("Tentativo non valido!");
            return;
        }

        if (tentativo.equals(parolaSegreta)) {
            messageLabel.setText("Hai vinto! La parola era: " + parolaSegreta);
            inviaButton.setDisable(true);
            return;
        }

        // Calcola strike e ball
        char[] strike = new char[lunghezzaParola];
        char[] ball = new char[lunghezzaParola];
        boolean[] parolaUsata = new boolean[lunghezzaParola];

        for (int i = 0; i < lunghezzaParola; i++) {
            strike[i] = '-';
            ball[i] = '-';
        }

        for (int i = 0; i < lunghezzaParola; i++) {
            if (tentativo.charAt(i) == parolaSegreta.charAt(i)) {
                strike[i] = '!';
                parolaUsata[i] = true;
            }
        }

        for (int i = 0; i < lunghezzaParola; i++) {
            if (strike[i] == '!') continue;
            for (int j = 0; j < lunghezzaParola; j++) {
                if (!parolaUsata[j] && tentativo.charAt(i) == parolaSegreta.charAt(j)) {
                    ball[i] = '*';
                    parolaUsata[j] = true;
                    break;
                }
            }
        }

        
        strikeLabel.setText("Strike: " + new String(strike));
        ballLabel.setText("Ball:   " + new String(ball));
        messageLabel.setText("Riprova!");
        tentativoField.clear();
    }
}