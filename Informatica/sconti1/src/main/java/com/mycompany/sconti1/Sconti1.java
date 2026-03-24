package com.mycompany.sconti1;
import java.util.*;

public class Sconti1 {

    public static void main(String[] args) {
        int DIM=5;
        int[] p=new int[DIM];
        int pTot=0;
        
        Scanner tastiera=new Scanner(System.in);
        
     //inserimento prezzi
     for(int i=1; i<DIM+1; i++){
         try{
            System.out.println("inserisci prezzo"+i+":");
            p[i]=tastiera.nextInt();
         }catch(InputMismatchException e){
             System.out.println("dato errato");
             System.exit(0);
         }
        }
     
     //controllo e applicazione del diritto allo sconto
           for(int i=1; i<DIM+1; i++){ 
            if(p[i]>100){
                p[i]-=(p[i]*10/100);
                pTot+=(p[i]*10/100);
            }
        }
           
           //stampa prezzi scontati
           for(int i=1; i<DIM+1; i++){
           System.out.println("prezzo articolo"+i+":"+p[i]);
           }
           
           //stampa somma sconti applicati
           System.out.println("la somma degli sconti applicati e:"+pTot);
    }
}
