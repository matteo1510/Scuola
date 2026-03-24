package com.mycompany.inputtastiera;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InputTastiera {

    public static void main(String[] args) {
       InputStreamReader input=new InputStreamReader(System.in);
       BufferedReader tastiera=new BufferedReader(input);
       String dato;
       int numero=0;
        try {
            System.out.println("Inserisci numero: ");
            dato=tastiera.readLine();
            numero=Integer.parseInt(dato);
            numero+=1;
        } catch (IOException | NumberFormatException e) {
           System.out.println("Dato errato");
        }
        System.out.println("Numero: "+numero);
    }
}