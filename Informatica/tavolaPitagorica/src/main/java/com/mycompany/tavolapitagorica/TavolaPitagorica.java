package com.mycompany.tavolapitagorica;

import java.util.*;

public class TavolaPitagorica {

    private static Scanner tastiera=new Scanner(System.in);
    public static void main(String[] args) {
        int n=0;
        int[][] tavolaPitagorica;
        
        try{
            System.out.print("inserisci la dimensione della tavola: ");
            n=tastiera.nextInt();
            n++;
        }catch(Exception e){
            System.out.print(e.getCause());
        }
        
        tavolaPitagorica= new int[n][n];
        
        for(int i=1; i<n; i++){
          tavolaPitagorica[0][i]=i;
          tavolaPitagorica[i][0]=i;
        }
        
        for(int i=1; i<n; i++){
          for(int j=1; j<n; j++){
              tavolaPitagorica[i][j]= j*i;
          }  
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
              System.out.print(tavolaPitagorica[i][j]+"\t");
          }  
            System.out.println("");
        }
    }
}