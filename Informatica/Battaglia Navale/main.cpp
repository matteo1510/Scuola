#include<stdio.h>

int main(){
    
    int r,c, i, riga, colonna, navi[5][5], navig1[10][10], navig2[10][10];
    float h;
    char u;
    
     //caricamento arrey navi
   navi[0][0]=1;   
   navi[0][1]=1;
   navi[0][2]=1;
   navi[0][3]=2;
   navi[0][4]=2;
   navi[1][0]=3;
   navi[1][1]=3;
   navi[1][2]=4;
   navi[1][3]=4;
   navi[1][4]=5;
   
   
    //inizio
    printf("BATTAGLIA NAVALE\n");
    printf("POSIZIONAMENTO NAVI\n");
    printf("Passa il dispositivo al giocatore 1\n");
    //comando per pulire schermo
    
    
    //caricamento array navig1
    printf("POSIZIONAMENTO NAVI GIOCATORE 1\n");
    printf("Hai a disposizione una griglia 10x10 dove posizionare le seguenti navi: \n");
    //stampa array navi
    for(r=0; r<2; r++){
        for(c=0; c<5; c++){
            printf("%d ",navi[r][c]);
        }
        printf("\n");
    }
    printf("Posizionamento navi da 1:\n");
    for(i=0; i<4; i++){
        printf("inserisci la colonna(1-10): ");
        scanf("%d", &colonna);
        printf("\ninserisci la riga(1-10): ");
        scanf("%d", &riga);
        /*conversione da lettera a numero
        if(riga=='a'){
        riga=0;
        }else if(riga=='b'){
            riga=1;
        }else if(riga=='c'){
            riga=2;
        }else if(riga=='d'){
            riga=3;
        }else if(riga=='e'){
            riga=4;
        }else if(riga=='f'){
            riga=5;
        }else if(riga=='g'){
            riga=6;
        }else if(riga=='h'){
            riga=7;
        }else if(riga=='i'){
            riga=8;
        }else if(riga=='j'){
            riga=9;
        }*/
        navig1[colonna][riga]=1;
    }
  
   for(r=0; r<10; r++){
        for(c=0; c<5; c++){
            printf("%d ",navig1[c][r]);
        }
        printf("\n");
    }
   
    
    
    
    
    return 0;
}
