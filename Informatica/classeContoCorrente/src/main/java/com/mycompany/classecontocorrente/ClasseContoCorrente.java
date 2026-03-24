package com.mycompany.classecontocorrente;

import java.util.*;

public class ClasseContoCorrente {
    
   public static Scanner tastiera=new Scanner(System.in);

    public static void main(String[] args) {
        
        //dichiarazione variabili
        ContoCorrente c1 = new ContoCorrente();
        int scelta=0;
        boolean loop=true;
        
        do{
        //menu
        System.out.println("***MENU***");
        System.out.println("1.Visualizza saldo");
        System.out.println("2.Modifica saldo");
        System.out.println("3.Preleva");
        System.out.println("4.Versa");
        System.out.println("5.Esci");
        
        scelta=tastiera.nextInt();
        
        switch(scelta){
            case 1:
                System.out.println(c1.getSaldo());
              break;
            case 2:
                System.out.println("Inserisci importo:");
                float i1 = tastiera.nextFloat();
                c1.setSaldo(i1);
                break;
            case 3:
                System.out.println("Inserisci importo:");
                float i2 = tastiera.nextFloat();
                c1.preleva(i2);
                break;
            case 4:
                System.out.println("Inserisci importo:");
                float i3 = tastiera.nextFloat();
                c1.versa(i3);
                break;
            case 5:
                loop=false;
                break;
        }
        }while(loop);
    }
}
