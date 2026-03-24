package com.mycompany.metodistatici;

import java.util.*;

public class MetodiStatici {

    public static void main(String[] args) {
        
        System.out.println("metodi statici");
        Scanner tastiera=new Scanner(System.in).useLocale(Locale.US);
        
        int raggio=0;
        System.out.println("inserisci il valore del raggio: ");
        raggio=tastiera.nextInt();
        System.out.println("Area="+areaCerchio(raggio));
        System.out.println("Circonferenza="+circonferenzaCerchio(raggio));
        
        double raggio1=0;
        System.out.println("inserisci il valore del raggio: ");
        raggio1=tastiera.nextDouble();
        System.out.println("Area="+areaCerchio(raggio1));
        System.out.println("Circonferenza="+circonferenzaCerchio(raggio1));
    }
    
    public static double areaCerchio(int r) {
        return Math.pow(r,2)*Math.PI;
    }
    
    public static double areaCerchio(double r) {
        return Math.pow(r,2)*Math.PI;
    }
    
    public static double circonferenzaCerchio(int r) {
        return Math.PI*2*r;
    }
    
      public static double circonferenzaCerchio(double r) {
        return Math.PI*2*r;
    }
    
}
