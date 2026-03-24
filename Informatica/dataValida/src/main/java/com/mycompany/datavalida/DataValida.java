package com.mycompany.datavalida;
import java.util.*;

public class DataValida {

    public static void main(String[] args) {
        int gg, mm, aaaa;
        boolean bisestile=false, dataValida=false;
        Scanner tastiera=new Scanner(System.in);
        
        System.out.println("Inserisci giono: ");
        gg=tastiera.nextInt();
        System.out.println("Inserisci mese: ");
        mm=tastiera.nextInt();
        System.out.println("Inserisci anno: ");
        aaaa=tastiera.nextInt();
        
        if(gg>=31 || gg<=1){
           dataValida=false;
        }
        
        if(mm==11 || mm==4 || mm==6 || mm==9){
            if(gg>=1 && gg<=30){
                dataValida=true;
            }else{
                dataValida=false;
            }
        }else if(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12){
            
            if(gg>=1 && gg<=31){
                dataValida=true;
            }else{
                dataValida=false;
            }
            
        }else if(mm==2){
            try{
            dataValida=true;
            if (aaaa<1582){
             dataValida=false;
            }
            if (dataValida){
                if(aaaa%400==0 || (aaaa%100!=0 && aaaa%4==0)){
                    bisestile=true;
                }else{
                    bisestile=false;
                }
            }
        }catch (InputMismatchException e){
            dataValida=false;
        }
          if(bisestile=false){
              if(gg>=1 && gg<=29){
                  dataValida=true;
              }else{
                  dataValida=false;
              }
          }else if(gg>=1 && gg<=28){
              dataValida=true;
          }else{
              dataValida=false;
          }
    } 
        if(dataValida){
            System.out.println("data valida"); 
        }else{
             System.out.println("data non valida");
        }
    }
    }
