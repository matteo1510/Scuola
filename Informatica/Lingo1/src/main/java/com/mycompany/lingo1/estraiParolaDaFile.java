package com.mycompany.lingo1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class estraiParolaDaFile {
    
        static Scanner tastiera = new Scanner(System.in);
        private int n;
        private String linea;
        private int lunghezzaParola;
        private ArrayList<String> parole = new ArrayList();
        private Random random = new Random();
        private String f;
        
        public estraiParolaDaFile(){};
        
       
        
        public String generaParola(String f , int lunghezzaParola){
             
            File file=new File(f);
        try{
            FileReader input = new FileReader(file);
            BufferedReader reader=new BufferedReader(input);
             
            
           String parola= reader.readLine();
           
            while(parola != null){
            if(parola.length() == lunghezzaParola){
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
        String parola= parole.get(n);
        return parola;
        }
    }
