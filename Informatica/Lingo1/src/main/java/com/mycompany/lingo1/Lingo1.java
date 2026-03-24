package com.mycompany.lingo1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lingo1 {

    static Scanner tastiera = new Scanner(System.in);

    public static void main(String[] args) {
        int lunghezzaParola=5;
        String parola;
        String tentativo;
        char[] strike;
        char[] ball;
        ArrayList<String> parole = new ArrayList<>();

        /* File file = new File("1000_parole_italiane_comuni.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            System.out.print("Lunghezza parola: ");
            lunghezzaParola = tastiera.nextInt();
            tastiera.nextLine(); 

            
            while ((parola = reader.readLine()) != null) {
                if (parola.length() == lunghezzaParola) {
                    parole.add(parola.toLowerCase());
                }
            }
            reader.close();

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
            return;
        }

        if (parole.isEmpty()) {
            System.out.println("Nessuna parola trovata con quella lunghezza!");
            return;
        }
*/
        
         estraiParolaDaFile p=new  estraiParolaDaFile();
      parola=p.generaParola("1000_parole_italiane_comuni.txt", 5);
      System.out.println(parola);
      
        strike = new char[lunghezzaParola];
        ball = new char[lunghezzaParola];
        for (int i = 0; i < lunghezzaParola; i++) {
            strike[i] = '-';
            ball[i] = '-';
        }

    

        //parola = parole.get(random.nextInt(parole.size()));

        
        System.out.println("Indovina la parola!");

        while (true) {
            tentativo = tastiera.nextLine().toLowerCase();

            
            while (tentativo.length() != lunghezzaParola) {
                System.out.println("Tentativo non valido, inserire una parola di "+lunghezzaParola+" caratteri :");
                tentativo = tastiera.nextLine().toLowerCase();
            }

            if (tentativo.equals(parola)) {
                System.out.println("Hai vinto!");
                break;
            } else {
                
                for (int i = 0; i < lunghezzaParola; i++) {
                    strike[i] = '-';
                    ball[i] = '-';
                }

                boolean[] letteraUsata = new boolean[lunghezzaParola];

                
                for (int i = 0; i < lunghezzaParola; i++) {
                    if (tentativo.charAt(i) == parola.charAt(i)) {
                        strike[i] = '!';
                        letteraUsata[i] = true;
                    }
                }

                
                for (int i = 0; i < lunghezzaParola; i++) {
                    if (strike[i] == '!') {
                    for (int j = 0; j < lunghezzaParola; j++) {
                        if (!letteraUsata[j] && tentativo.charAt(i) == parola.charAt(j)) {
                            ball[i] = '*';
                            letteraUsata[j] = true;
                            break;
                        }
                    }
                  }
                }

                
                System.out.print("Strike: ");
                for (char c : strike) System.out.print(c);
                System.out.println();

                System.out.print("Ball:   ");
                for (char c : ball) System.out.print(c);
                System.out.println();
                
                char[] ris = new char[lunghezzaParola];
                for (int i=0; i<lunghezzaParola; i++){
                    ris[i]=strike[i];
                    
                    if(ball[i] == '*' && strike[i] != '!'){
                        ris[i]=ball[i];
                    }
                }
                
                for (char c : ris) System.out.println(ris[c]);
            }
        }
    }
}