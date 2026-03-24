package com.mycompany.temperature;
import java.util.*;
public class Temperature {

public static void main(String[] args) {
    Scanner tastiera=new Scanner(System.in);
        
//dichiarazione
int i=0;
int imax=0;
int imin=0;
float[] temperatura = new float[3]; 
float max=0, min=0, st=0, mt=0;
String [] [] citta = new String [15] [6];

//caricamento array + st
System.out.println("INSERIMENTO TEMPERATURE\n");
for(i=0; i<3; i++){
System.out.println("\ncitta: ");
citta[i][i]=tastiera.nextLine();
System.out.println("temperatura: ");
temperatura[i]=tastiera.nextFloat();
st=st+temperatura[i];
}

//inizializzazione di max, min
max=temperatura[0];
min=temperatura[0];


//controllo maggiore
for(i=0; i<3; i++){
if(temperatura[i]>max){
max=temperatura[i];
imax= i;
}
}

//controllo minore
for(i=0; i<3; i++){
if(temperatura[i]<min){
min=temperatura[i];
imin= i;
}
}

//media temperature
mt=st/3;

//stampa array citta e temperatura
System.out.println("\nRIEPILOGO:\n\n");
for(i=0; i<3; i++){
System.out.println(citta[i]+":" +temperatura[i]);
}

//stampa calcoli
System.out.println("la temperatura più alta e a"+citta[imax]+ "con"+max);
System.out.println("la temperatura più bassa e a"+citta[imin]+ "con"+min);
System.out.println("la media delle temperature e" + mt);
    }
}
