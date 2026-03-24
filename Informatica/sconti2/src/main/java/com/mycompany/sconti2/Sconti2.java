package com.mycompany.sconti2;

import java.util.*;

public class Sconti2 {

    
    public static void main(String[] args) {
        Scanner tastiera=new Scanner(System.in);
        
        float prezzo=0, sconto=0, scontoTot=0, prezzoFinale=0, prezzoTot=0;
        boolean datoValido=false;
        
        while(!datoValido){
            try{
                for (int i=0; i<5; i++){
                    prezzo=tastiera.nextFloat();
                    if(prezzo>100){
                        sconto= (float) (prezzo * 0.10);
                        prezzo=(float) (prezzo*0.90);
                    }
                    prezzoFinale+=prezzo;
                    scontoTot+=sconto;
                }
                System.out.println("il prezzo finale è:"+prezzoTot);
                System.out.println("Lo sconto totale è:"+ scontoTot);
                datoValido=true;
                
                
                
                
            }catch(Exception ex);{
            System.out.println ("Dato errato!");
            tastiera.nextLine();
            }
        }
        
    }
}
