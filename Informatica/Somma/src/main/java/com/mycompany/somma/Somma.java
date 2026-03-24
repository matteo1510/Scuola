package com.mycompany.somma;
import java.io.*;
import java.util.*;

public class Somma {

    public static void main(String[] args) {
       InputStreamReader input=new InputStreamReader(System.in);
       BufferedReader tastiera=new BufferedReader(input);
       String dato1,dato2;
       int numero1=0, numero2=0, somma=0;
       
        try {
            System.out.println("Inserisci primo numero: ");
            dato1=tastiera.readLine();
            numero1=Integer.parseInt(dato1);
            System.out.println("Inserisci secondo numero: ");
            dato2=tastiera.readLine();
            numero2=Integer.parseInt(dato2);
              somma=numero1+numero2;
        System.out.println("Somma: "+somma);
        } catch (Exception e) {
           System.out.println("Dato errato");
        }
      
    }
}
