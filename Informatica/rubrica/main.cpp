#include <iostream>
#include <cstdlib>
using namespace std;

struct contatto {
    string nome;
    string cognome;
    string indirizzo;
    string citta;
    string numero_di_telefono;
};

void CaricaRubrica(contatto a[], int &n) {
    cout << "Quanti contatti vuoi inserire? ";
    cin >> n;
    for (int i = 0; i < n; i++) {
        cout << "\nContatto " << i + 1 << endl;
        cout << "Nome: ";
        cin >> a[i].nome;
        cout << "Cognome: ";
        cin >> a[i].cognome;
        cout << "Indirizzo: ";
        cin >> a[i].indirizzo;
        cout << "Città: ";
        cin >> a[i].citta;
        cout << "Numero di telefono: ";
        cin >> a[i].numero_di_telefono;
    }
}

void AggiungiContatto(contatto a[], int &n) {
    if (n >= 100) {
        cout << "Rubrica piena!" << endl;
        return;
    }
    cout << "\nAggiungi nuovo contatto:\n";
    cout << "Nome: ";
    cin >> a[n].nome;
    cout << "Cognome: ";
    cin >> a[n].cognome;
    cout << "Indirizzo: ";
    cin >> a[n].indirizzo;
    cout << "Città: ";
    cin >> a[n].citta;
    cout << "Numero di telefono: ";
    cin >> a[n].numero_di_telefono;
    n++;
}

void VisualizzaContatti(contatto a[], int n) {
    cout << "\nRubrica:\n";
    for (int i = 0; i < n; i++) {
        cout << "\nContatto " << i + 1 << ":\n";
        cout << "Nome: " << a[i].nome << endl;
        cout << "Cognome: " << a[i].cognome << endl;
        cout << "Indirizzo: " << a[i].indirizzo << endl;
        cout << "Città: " << a[i].citta << endl;
        cout << "Telefono: " << a[i].numero_di_telefono << endl;
    }
}

void ModificaContatto(contatto a[], int n) {
    string nome;
    int posizione = -1, scelta = 0;
    cout << "\nInserisci il nome del contatto che vuoi modificare: ";
    cin >> nome;

    for (int i = 0; i < n; i++) {
        if (a[i].nome == nome) {
            posizione = i;
            break;
        }
    }

    if (posizione == -1) {
        cout << "\nContatto non trovato.\n";
        return;
    }

    cout << "Cosa vuoi modificare:\n";
    cout << "1. Nome\n2. Cognome\n3. Indirizzo\n4. Città\n5. Numero di telefono\n";
    cin >> scelta;

    switch (scelta) {
        case 1:
            cout << "Nuovo nome: ";
            cin >> a[posizione].nome;
            break;
        case 2:
            cout << "Nuovo cognome: ";
            cin >> a[posizione].cognome;
            break;
        case 3:
            cout << "Nuovo indirizzo: ";
            cin >> a[posizione].indirizzo;
            break;
        case 4:
            cout << "Nuova città: ";
            cin >> a[posizione].citta;
            break;
        case 5:
            cout << "Nuovo numero di telefono: ";
            cin >> a[posizione].numero_di_telefono;
            break;
        default:
            cout << "Scelta non valida.";
    }
}

int main() {
    contatto rubrica[100];
    int n = 0;
    int scelta;

    do {
        cout << "\nMenu:\n";
        cout << "1. Carica Rubrica\n";
        cout << "2. Aggiungi Contatto\n";
        cout << "3. Modifica Contatto\n";
        cout << "4. Visualizza Contatti\n";
        cout << "5. Esci\n";
        cout << "Scelta: ";
        cin >> scelta;

        switch (scelta) {
            case 1: CaricaRubrica(rubrica, n); break;
            case 2: AggiungiContatto(rubrica, n); break;
            case 3: ModificaContatto(rubrica, n); break;
            case 4: VisualizzaContatti(rubrica, n); break;
            case 5: exit(0);
            default: cout << "Scelta non valida.\n";
        }
    } while (true);

    return 0;
}





