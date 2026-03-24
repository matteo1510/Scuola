/*
file di due tipi: 
file di testo-> con codice asci (leggibile), potrebbero avere problemi di codifica
file binari-> che possono leggere interi ogetti java e non solo caratteri, non hanno problemi di codifica
per i file binari si usa la classse File:
File file=new file("nome file");
metodi della classe:
exists();
createNewFile()
delete();
isFile();
isDir();
mkDir();
*/
package com.mycompany.fileinjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class FileInJava {

   static Scanner tastiera=new Scanner (System.in);
    public static void main(String[] args) {
        try{

        //classe File che permette di creare un oggetto di tipo File
        File file=new File("prova.txt");
        
        //classe FileWriter permette di creare uno stream e scrivere caratteri uno alla volta 
        FileWriter writer=new FileWriter(file,true);
        
        //scrivere su file di testo (viene sovrascritto)
        System.out.println("scrivi: ");
        String tmp=tastiera.nextLine();
        writer.write(tmp+"\n");
        
        //chiudere lo stream
        writer.close();
        
       //classe FileReader permette di creare uno stream e leggere caratteri
        FileReader reader=new FileReader(file);
        
        //leggere linee intere
        BufferedReader lineReader=new BufferedReader(reader);
        
        //leggo una linea e la stampo finche non arrivo alla fine
        String linea=lineReader.readLine();
        
        while(linea != null){
            System.out.println(linea);
            linea=lineReader.readLine();
        }
        
        //chiudo lo stram
        lineReader.close();
        reader.close();
        
    }catch(IOException e){
    System.out.println(e.getMessage());
    }
  }
}
