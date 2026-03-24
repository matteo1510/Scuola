package com.mycompany.somma_java.util;
import java.util.*;
public class Somma_javaUtil {

    public static void main(String[] args) {
        Scanner tastiera=new Scanner(System.in).useLocale(Locale.US);
        double numero1=0, numero2=0, somma=0;
         try {
            System.out.println("Inserisci primo numero: ");
            numero1=tastiera.nextDouble();
            System.out.println("Inserisci secondo numero: ");
            numero2=tastiera.nextDouble();
              somma=numero1+numero2;
        System.out.println("Somma: "+somma);
        } catch (InputMismatchException e) {
           System.out.println("Dato errato");
        }
    }
}
