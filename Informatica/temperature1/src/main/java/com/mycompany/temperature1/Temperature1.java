package com.mycompany.temperature1;

import java.util.*;
import static java.util.Locale.US;

public class Temperature1 {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        // dichiarazione    
        int DIM = 0;
        System.out.print("quante temperature vuoi inserire?: ");
        DIM = tastiera.nextInt();

        float[] temperature = new float[DIM]; 
        String[] citta = new String[DIM];
        float mt = 0;
        int scelta = 0;
        boolean loop=true;
        
        while(loop){

        System.out.println("\nMENU'");
        System.out.println("0 - carica temperature");
        System.out.println("1 - visualizza temperature");
        System.out.println("2 - calcola media temperature");
        System.out.println("3 - calcola temperatura massima");
        System.out.println("4 - calcola temperatura minima");
        System.out.println("5 - esci");
        System.out.print("inserisci la tua scelta: ");
        scelta = tastiera.nextInt();

        switch(scelta){
            case 0:
                caricaArray(temperature, citta);
                break;
            case 1:
                visualizzaArray(temperature, citta);
                break;
            case 2:
                mt = calcolaMedia(temperature);
                System.out.println("media temperature: " + mt);
                break;
            case 3:
                System.out.println("temperatura massima: " + calcolaMassimo(temperature));
                break;
            case 4:
                System.out.println("temperatura minima: " + calcolaMinimo(temperature));
                break;
            case 5:
                loop=false;
                break;
            default:
                System.out.println("scelta non valida");
                break;
        }
      }
    }

    public static void caricaArray(float[] array1, String[] array2){
        Scanner tastiera = new Scanner(System.in).useLocale(US);

        System.out.println("\nINSERIMENTO TEMPERATURE");       
        for(int i = 0; i < array1.length; i++){
            try{
            System.out.print("\ncitta: ");
            array2[i] = tastiera.nextLine();  
            }catch(Exception e){
                 System.out.println("dato errato");
                  array2[i] = tastiera.nextLine(); 
            }
            try{
            System.out.print("temperatura: ");
            array1[i] = tastiera.nextFloat();

            tastiera.nextLine();
            }catch(Exception e){
                System.out.println("dato errato");
                 array1[i] = tastiera.nextFloat();
            }
        }
    }

    public static void visualizzaArray(float[] array1, String[] array2){
        System.out.println("\nELENCO TEMPERATURE");
        for(int i = 0; i < array1.length; i++){
            System.out.println(array2[i] + ": " + array1[i]);
        }
    }

    public static float calcolaMedia(float[] array1){
        float st = 0;
        for(int i = 0; i < array1.length; i++){
            st = st + array1[i];
        }
        return st / array1.length;
    }

    public static float calcolaMassimo(float[] array1){
        float max = array1[0];
        for(int i = 1; i < array1.length; i++){
            if(array1[i] > max){
                max = array1[i];
            }
        }
        return max;
    }

    public static float calcolaMinimo(float[] array1){
        float min = array1[0];
        for(int i = 1; i < array1.length; i++){
            if(array1[i] < min){
                min = array1[i];
            }
        }
        return min;
    }
}
