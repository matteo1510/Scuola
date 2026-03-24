package com.mycompany.azienda;

import java.util.*;

public class Azienda {

    public static Scanner tastiera=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Dipendente d1=new Dipendente("matteo",1900);
        int p;
        
        System.out.println("di quanto vuoi aumentare lo stipendio in percentuale? : ");
        p=tastiera.nextInt();
        System.out.println(d1.aumentoStipendio(p));
    }
}
