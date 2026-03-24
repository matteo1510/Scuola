package com.mycompany.mialibreria;
import java.util.*;

public class MiaLibreria {

    public static void caricaArray(int array[]){
        Scanner tastiera=new Scanner(System.in).useLocale(Locale.US);
        for (int i=0; i<array.length; i++) {
            System.out.println("Elemento " + i + ": ");
            array[i]=tastiera.nextInt();
        }
    }
    
    public static void stampaArray(int array[]){
        for (int i=0; i<array.length; i++) {
            System.out.println("Elemento " + i + ": " + array[i]);
        }
    }
}
