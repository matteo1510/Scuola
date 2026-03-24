package com.mycompany.caricaarray;

import java.util.*;

public class CaricaArray {
     
    public static void main(String[] args) {
    Scanner tastiera=new Scanner(System.in).useLocale(Locale.US);
        
    int DIM=0;
        
    System.out.print("Quanti numeri vuoi inserire?: ");
    DIM=tastiera.nextInt();

    int [] a=new int[DIM];
    
    caricaArray(a);
    stampaArray(a);
    
    }
    
    
    private static void caricaArray(int array[]){
        Scanner tastiera=new Scanner(System.in).useLocale(Locale.US);
        for (int i=0; i<array.length; i++) {
            System.out.println("Elemento " + i + ": ");
            array[i]=tastiera.nextInt();
        }
    }
    
    private static void stampaArray(int array[]){
        for (int i=0; i<array.length; i++) {
            System.out.println("Elemento " + i + ": " + array[i]);
        }
    }
}
    
