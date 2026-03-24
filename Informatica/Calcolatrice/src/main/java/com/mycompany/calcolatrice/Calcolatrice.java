package com.mycompany.calcolatrice;
import java.util.*;

public class Calcolatrice {

    public static void main(String[] args) {
        int n1=0, n2=0;
        int operatore=0;
        float ris=0f;
        boolean datoValido=false;
       Scanner tastiera=new Scanner(System.in);
       try{
        System.out.println("Inserisci primo numero: ");
        n1=tastiera.nextInt();
        System.out.println("Inserisci secondo numero: ");
        n2=tastiera.nextInt();
          System.out.println("Scegli operazione: 1.Somma, 2.Sottrazione, 3.Divisione, 4.Moltiplicazione ");
            operatore=tastiera.nextInt();
            datoValido=true;
            if(n2==0 && operatore==4){
                 System.out.println("Impossibile dividere per 0");
                 System.exit(0);
            }
       }catch(InputMismatchException e){
           System.out.println("dato errato");
           datoValido=false;
       }
     if(datoValido){
         switch(operatore){
             case 1:
                 ris= n1+n2;
                 break;
             case 2:
                 ris= n1-n2;
                 break;
             case 3:
                 ris= n1/n2;
                 break;
             case 4:
                 ris=n1*n2;
                 break;
             default:
                 System.out.println("dato errato");
         }
                    System.out.println("Risultato: "+ris);
         }

    }
}
