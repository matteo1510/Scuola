#include <stdio.h>
#include<time.h>
#include <stdlib.h>


int main(int argc, char** argv) {

    int a[5];
    int i;
    int max, min;
    int somma;
    
    srand(time(NULL));
    
    for(i=0; i<5; i++){
        a[i]= rand() % 10;
    }
    
    for(i=0; i<5; i++){
        printf("%d", a[i]);
    }
    
    printf("\nInserisci un numero max (1-10): ");
    scanf("%d", &max);
     printf("\nInserisci un numero min (1-10): ");
    scanf("%d", &min);
     
    //min+1 fino a max
    //mim+min+1 fino a max
    
    for(i=0, somma=0; i<max; i++){
       somma=somma+ (min+(min+i)); 
    }
    
    printf("%d", somma);
    
    return 0;
}

