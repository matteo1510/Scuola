package com.mycompany.morracinese;

import java.util.*;

public class MorraCinese {

    public static Scanner tastiera=new Scanner(System.in);
    
    public static void main(String[] args) {
        int scelta=0;
        int n=0;
        boolean loop=true;
        
        while(loop){
        n=(int)(Math.random()*3);
        
        System.out.println("0: sasso");
        System.out.println("1: carta");
        System.out.println("2: forbice");
        System.out.println("3: esci");
        
        scelta=tastiera.nextInt();
        
        if(scelta == 3){
            loop=false;
        }else{
        
        System.out.println("");
        
        stampaGiocata(n);
        
        verificaGiocata(scelta,n);
        }
        }
        System.out.println("gioco terminato");
    }
    
    public static void stampaGiocata(int n){
        switch (n) {
            case 0:
                System.out.println("sasso");
                break;
            case 1:
                System.out.println("carta");
                break;
            case 2:
                System.out.println("forbice");
                break;
        }
    }
    
    public static void verificaGiocata(int scelta, int n){
        if(scelta== n){
            System.out.println("pareggio");
        }else{
            if ((scelta == 0 && n == 2) || (scelta == 1 && n ==0) || (scelta == 2 && n==1)){
                System.out.println("hai vinto\n");
            }else{
                System.out.println("hai perso\n");
            }
        }
    }
}
