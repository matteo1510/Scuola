package com.mycompany.annobisestile;

import java.util.*;

public class AnnoBisestile {

    public static void main(String[] args) {
        int anno=0;
        boolean annoValido=true;
        Scanner tastiera=new Scanner(System.in);
        System.out.println("Inserisci anno: ");
        
        try {
            anno=tastiera.nextInt();
            if (anno<1582){
                System.out.println("anno errato: ");
                annoValido=false;
            }
            if (annoValido){
                if(anno%400==0 || (anno%100!=0 && anno%4==0)){
                    System.out.println("L'anno e bisestile: ");
                }else{
                    System.out.println("L'anno non e bisestile: ");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Dato errato");
        }
    }
}
