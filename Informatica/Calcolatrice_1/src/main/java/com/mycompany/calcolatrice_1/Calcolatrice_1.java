package com.mycompany.calcolatrice_1;
import java.util.*;

public class Calcolatrice_1 {

    public static void main(String[] args) {
        
        int n1=0;
        int n2=0;
        int operatore=0;
        float ris=0f;
        boolean datoValido=false;
        
        Scanner tastiera=new Scanner(System.in);
        
       try{
        System.out.println("Inserisci primo numero: ");
        n1=tastiera.nextInt();
        
        System.out.println("Inserisci secondo numero: ");
        n2=tastiera.nextInt();
        
        System.out.println("Scegli operazione: \n1.Somma \n2.Sottrazione \n3.Divisione \n4.Moltiplicazione \nScelta:");
            operatore=tastiera.nextInt();
            
            datoValido=true;
            
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
                 try{
                 ris= n1/n2;
                 
                 }catch(ArithmeticException e){
                     System.out.println(e.getMessage());
                 }
                 break;
             case 4:
                 ris=n1*n2;
                 break;
             default:
                 System.out.println("dato errato");
                 datoValido=false;
         }
                if(datoValido){
                    System.out.println("Risultato: "+ris);
                }
                    
         }

    }
}
