package com.mycompany.estrainomedafile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;


public class EstraiNomeDaFile {

    public static void main(String[] args) {
        int n;
        String linea;
        ArrayList<String> parole=new ArrayList();
        Random random=new Random();
        
        File file=new File("words.italian.txt");
        
        try{
            FileReader input=new FileReader(file);
            BufferedReader reader=new BufferedReader(input);
            
           String parola= reader.readLine();
           
            while(parola != null){
            if(parola.length() == 5){
                parole.add(parola);
            }
            parola= reader.readLine();
        }
       
        reader.close();
        input.close();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        n = random.nextInt(0, parole.size());
        System.out.println("la parola è: " + parole.get(n));
    }
}
