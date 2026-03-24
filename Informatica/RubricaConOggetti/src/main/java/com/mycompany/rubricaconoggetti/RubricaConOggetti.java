package com.mycompany.rubricaconoggetti;

import java.util.*;

public class RubricaConOggetti {
    
    public static Scanner tastiera=new Scanner(System.in);

    public static void main(String[] args) {
        
        //dichiarazione
         ArrayList<Contatto> rubrica = new ArrayList();
         String nome="";
         String cognome="";
         String telefono="";
         int scelta=0;
         boolean loop=true;
         
        //menù
         do{
        System.out.println("MENU RUBRICA");
        System.out.println("1. Aggiungi contatto");
        System.out.println("2. Visualizza contatti");
        System.out.println("3. Rimuovi contatto");
        System.out.println("4. Cerca contatto");
        System.out.println("5. Modifica contatto");
        System.out.println("6. Pulisci rubrica");
        System.out.println("7. Ordina rubrica");
        System.out.println("8. Esci");
        System.out.println("Inserisci la tua scelta:");
        scelta=tastiera.nextInt();
        tastiera.skip("\n");
        
        switch(scelta){
            case 1:
                //aggiungi contatto
                System.out.print("Nome:");
                nome=tastiera.nextLine();
                
                System.out.print("Cognome:");
                cognome=tastiera.nextLine();
                
                System.out.print("Telefono:");
                telefono=tastiera.nextLine();;
                
                rubrica.add(new Contatto(nome,cognome,telefono));
                break;
            case 2:
                //visualizza contatti
                rubrica.forEach(System.out::println);
                break;
            case 3:
                //rimuovi contatto
                System.out.println("Contatto da eliminare:");
                break;
            case 4:
                //cerca conatto
                break;
            case 5:
                //modifica contatto
                break;
            case 6:
                //pulisci rubrica
                rubrica.clear();
                System.out.println("Rubrica pulita.");
                break;
            case 7:
                //ordina rubrica
                Collections.sort(rubrica,(a,b)->{
                    return a.getCognome().compareTo(b.getCognome());});     
                break;
            case 8:
                //esci
                loop=false;
                System.out.println("Uscita dal programma.");
                break;
            default:
                System.out.println("Scelta non valida.");
                break;
        }
    } while(loop);
    }
}