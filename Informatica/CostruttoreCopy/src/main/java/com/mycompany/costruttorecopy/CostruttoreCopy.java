package com.mycompany.costruttorecopy;

import java.util.*;

public class CostruttoreCopy {
    
    public static Scanner tastiera=new Scanner(System.in);

    public static void main(String[] args) {
        
        //dichiarazione
         ArrayList<Contatto> rubrica = new ArrayList();
         Contatto c1 = new Contatto();
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
        System.out.println("7. Esci");
        System.out.println("Inserisci la tua scelta:");
        scelta=tastiera.nextInt();
        tastiera.skip("\n");
        
        switch(scelta){
            case 1:
                System.out.print("Nome:");
                c1.setTelefono(tastiera.nextLine());
                
                System.out.print("Cognome:");
                c1.setTelefono(tastiera.nextLine());
                
                System.out.print("Telefono:");
                c1.setTelefono(tastiera.nextLine());
                
                rubrica.add(new Contatto(c1));
                break;
            case 2:
                rubrica.forEach(System.out::println);
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
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
