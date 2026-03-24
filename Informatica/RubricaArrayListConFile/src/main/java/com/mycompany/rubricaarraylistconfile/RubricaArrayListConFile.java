package com.mycompany.rubricaarraylistconfile;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class RubricaArrayListConFile {

public static Scanner tastiera=new Scanner(System.in);
    
public static void main(String[] args) {
        ArrayList<String> rubrica = new ArrayList<String>();
        int scelta=0;
        boolean loop=true;
        do{
        System.out.println("MENU RUBRICA");
        System.out.println("1. Aggiungi contatto");
        System.out.println("2. Visualizza contatti");
        System.out.println("3. Rimuovi contatto");
        System.out.println("4. Cerca contatto");
        System.out.println("5. Ordina rubrica");
        System.out.println("6. Modifica contatto");
        System.out.println("7. Pulisci rubrica");
        System.out.println("8. Salva su file");
        System.out.println("9. Carica da file");
        System.out.println("10. Esci");
        System.out.print("Inserisci la tua scelta:");
        scelta=tastiera.nextInt();
        tastiera.nextLine();
        
        switch(scelta){
            case 1:
                aggiungiContatto(rubrica);
                break;
            case 2:
                visualizzaContatti(rubrica);
                break;
            case 3:
                rimuoviContatto(rubrica);
                break;
            case 4:
                cercaContatto(rubrica);
                break;
            case 5: 
                ordinaRubrica(rubrica);
                break;
            case 6:
                modificaContatto(rubrica);
                break;
            case 7:
                pulisciRubrica(rubrica);
                break;
            case 8:
                salvaSuFile(rubrica);
                break;
            case 9:
                caricaDaFile(rubrica);
                break;
            case 10:
                loop=false;
                System.out.println("Uscita dal programma.");
                break;
            default:
                System.out.println("Scelta non valida.");
                break;
        }
    } while(loop);
    }

    public static void aggiungiContatto(ArrayList<String> r){
        if(r.isEmpty()){
        System.out.print("Quanti contatti vuoi aggiungere:");
        int n=tastiera.nextInt();
        tastiera.nextLine();
        for(int i=0; i<n; i++){
            System.out.print("Inserisci il nome del "+(i+1)+" contatto da aggiungere:");
            r.add(tastiera.nextLine());
        }
        }else{
            System.out.print("Inserisci il nome del contatto da aggiungere:");
            r.add(tastiera.nextLine());
        }
    }

    public static void visualizzaContatti(ArrayList<String> r){
        System.out.println("Contatti in rubrica:");
        for(int i=0; i<r.size(); i++){
            System.out.println(r.get(i));
        }
    }

    public static void rimuoviContatto(ArrayList<String> r){
        System.out.println("Inserisci il nome del contatto da rimuovere:");
        String nome=tastiera.nextLine();
        if(r.remove(nome)){
            System.out.println("Contatto rimosso.");
        } else {
            System.out.println("Contatto non trovato.");
        }
    }

    public static void cercaContatto(ArrayList<String> r){
        System.out.println("Inserisci il nome del contatto da cercare:");
        String nome=tastiera.nextLine();
        if(r.contains(nome)){
            System.out.println("Contatto trovato: " + nome);
        } else {
            System.out.println("Contatto non trovato.");
        }
    }

    public static void modificaContatto(ArrayList<String> r){
        System.out.println("Inserisci il nome del contatto da modificare:");
        String vecchioNome=tastiera.nextLine();
        if(r.contains(vecchioNome)){
            System.out.println("Inserisci il nuovo nome del contatto:");
            String nuovoNome=tastiera.nextLine();
            int index = r.indexOf(vecchioNome);
            r.set(index, nuovoNome);
            System.out.println("Contatto modificato.");
        } else {
            System.out.println("Contatto non trovato.");
        }
    }

    public static void pulisciRubrica(ArrayList<String> r){
        r.clear();
        System.out.println("Rubrica pulita.");
    }
        
    public static void ordinaRubrica(ArrayList<String> r){
       String temp;
    for (int i = 0; i < r.size() - 1; i++) {
        for (int j = 0; j < r.size() - 1 - i; j++) {

            // confronta due stringhe in ordine alfabetico
            if (r.get(j).compareToIgnoreCase(r.get(j + 1)) > 0) {
                // scambia
                temp = r.get(j);
                r.set(j, r.get(j + 1));
                r.set(j + 1, temp);
            }
        }
    }
  }
    
    public static void salvaSuFile(ArrayList<String> r) {
    try {
        FileWriter fw = new FileWriter("rubrica.txt");
        for (String contatto : r) {
            fw.write(contatto + "\n");   // ogni contatto su una riga
        }
        fw.close();
        System.out.println("Rubrica salvata su file.");
    } catch (Exception e) {
        System.out.println("Errore durante il salvataggio.");
    }
}
    
    public static void caricaDaFile(ArrayList<String> r) {
    try {
        File file = new File("rubrica.txt");
        if (!file.exists()) {
            System.out.println("Nessun file rubrica trovato.");
            return;
        }

        Scanner fileReader = new Scanner(file);
        r.clear();  // svuota la rubrica prima di caricare

        while (fileReader.hasNextLine()) {
            r.add(fileReader.nextLine());
        }

        fileReader.close();
        System.out.println("Rubrica caricata dal file.");
    } catch (Exception e) {
        System.out.println("Errore nel caricamento del file.");
    }
    }

}
