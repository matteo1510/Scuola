#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    // Inizializza il generatore di numeri casuali
    srand(time(NULL));

    int minimo = 1;
    int massimo = 100;
    int c=1;
    int tentativo;
    int tentativi=5;
    // Genera un numero casuale nell'intervallo [minimo, massimo]
    int numeroCasuale = minimo + rand() % (massimo - minimo + 1);
    printf("INDOVINA IL NUMERO (1-100)\n");
    do{
    printf("\nHai %d tentativi", tentativi);
    printf("\ntentativo %d: ", c);
    scanf("%d", &tentativo);
    if (tentativo==numeroCasuale){
    printf("\nHai indovinato! Il numero era %d", numeroCasuale);
    return 0;
    }else{
    if (tentativo>numeroCasuale) {
    printf("\ntroppo alto");
    }else{
    printf("\ntroppo basso");
    }
    }
    tentativi=tentativi-1;
c=c+1;
}while (c<=5);
 printf("\nHai esaurito i tentativi. il numero era %d", numeroCasuale);
    return 0;
}
