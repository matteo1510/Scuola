package com.mycompany.estrazionenomi;
import java.util.*;

public class EstrazioneNomi {

    public static void main(String[] args) {
        Scanner tastiera=new Scanner(System.in);
    Random casuale=new Random();
    int DIM=0;

    System.out.println("ESTRAZIONE NOMI");
   /* System.out.print("Quanti nomi vuoi inserire?: ");
    DIM=tastiera.nextInt();
    tastiera.nextLine();*/

    //String[] nomi=new String[DIM];
    
    String nomi[]={"bono","toledo","cariota","colato","di lenola","di rollo","ferrazzoli","ferracci","iacelli","lombardo","mazzoli","paolelli","pibiri","rusu","salvador","serra"
            ,"spinello","toledo","zoino"};

   /* //caricamento nomi
    for(int i=0; i<DIM; i++){
        System.out.print("inserisci nome "+(i+1)+": ");
        nomi[i]=tastiera.nextLine();
    }*/

    //estrazione casuale
    boolean[] estratti=new boolean[nomi.length];
    int cont=0;int x;

    System.out.println("\nPremi INVIO per estrarre un nome...");
    tastiera.nextLine();
    
    while(cont<nomi.length){
       x=casuale.nextInt(nomi.length);
        if(!estratti[x]){
            System.out.println((cont+1)+"."+nomi[x]);
            estratti[x]=true;
            cont++;
        }
    }
     System.out.println("\nHai estratto tutti i"+DIM+"nomi!");
  }
}



