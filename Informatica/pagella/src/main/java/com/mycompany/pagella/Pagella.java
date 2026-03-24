package com.mycompany.pagella;

import java.lang.reflect.Array;
import java.util.*;

public class Pagella {

    
    public static void main(String[] args) {
      
        Scanner tastiera=new Scanner(System.in);
        
//dichiarazione
    int[] voti=new int[6]; 
    String[] materie={"Italiano","Matematica","Storia","Inglese","Scienze","Educazione Fisica"};
    int s=0;
    int is=0;
    int max=0;
    float mv=0;
    
     System.out.println("\nINSERIMENTO VOTI:\n");
     
    //caricamento voti
    caricaArray(voti,materie);
        
    
    //somma voto sufficiente e insufficiente
    s=sommaSufficenti(voti);
    is=sommaInsufficenti(voti);
      
    //voto maggiore
     max=votoMaggiore(voti);
      
    //stampa voti
    stampaArray(voti,materie);

    //media voti
    mv=mediaVoti(voti);

//stampa risultati
    System.out.println("\nRISULTATI FINALI:\n");
    System.out.println("Numero voti sufficienti: "+s);
    System.out.println("Numero voti insufficienti: "+is);   
    System.out.println("Voto maggiore: "+max);
    System.out.printf("Media voti: %.2f\n",mv);
        
    }
    
    
    public static void caricaArray(int array1[],String array2[]){
        Scanner tastiera=new Scanner(System.in).useLocale(Locale.US);
        int c=0;
        
        for (int i=0; i<array1.length; i++) {
            System.out.print(array2[i]+": ");
            array1[i]=tastiera.nextInt();
        
         do{
            if(array1[i]>=0 && array1[i]<=10){
                c=1;
            }else{
                System.out.println("errore, immetti un voto compreso tra 1 e 10: ");
                System.out.print(array2[i]+": ");
                array1[i]=tastiera.nextInt();
                c=2;
            }
        }while(c==2);
        }
    }
    
    public static void stampaArray(int array1[], String array2[]){
        System.out.println("\nRIEPILOGO:\n");
        for(int i=0; i<array1.length; i++){
            System.out.println(array2[i]+": "+array1[i]);
        }
    }

    public static int sommaSufficenti(int array1[]){
    int s=0;

    for(int i=0; i<array1.length; i++){
      if(array1[i]>=6){
            s+=1;
        }
    }
    return s;
  } 


public static int sommaInsufficenti(int array1[]){
    int s=0;

    for(int i=0; i<array1.length; i++){
      if(array1[i]<6){
            s+=1;
        }
    }
    return s;
  } 


  public static int votoMaggiore(int array1[]){
    int u=array1[0];

    for(int i=0; i<array1.length; i++){
      if(array1[i]>u){
            u=array1[i];
        }
    }
    return u;
  }

  public static float mediaVoti(int array1[]){
    float mv=0;
    int sv=0;

    for(int i=0; i<array1.length; i++){
      sv=sv+array1[i];
    }
    mv=sv/array1.length;
    return mv;
   }
}