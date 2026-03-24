#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define NUM_WORDS 10  // Numero di parole nel dizionario

// Array di parole predefinite
const char *words[NUM_WORDS] = {
    "cane", "gatto", "albero", "computer", "libro", "tavolo", "casa", "auto", "fiume", "scuola"
};

const char* getRandomWord() {
    // Restituisce una parola casuale dall'array
    int randomIndex = rand() % NUM_WORDS;
    return words[randomIndex];
}

int main() {
    // Inizializza il generatore di numeri casuali
    srand(time(0));

    // Seleziona e stampa una parola casuale
    const char* randomWord = getRandomWord();
    printf("Parola casuale: %s\n", randomWord);

    return 0;
}