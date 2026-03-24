package com.mycompany.costocomputer;

public class Ram {
    
    //attributi
    private int capacitaGB;
    private String tipo;
    private double prezzo;
    
    //costruttore
    public Ram(int capacitaGB, String tipo, double prezzo) {
        this.capacitaGB = capacitaGB;
        this.tipo = tipo;
        this.prezzo = prezzo;
    }
    
    //metodi
    public int getCapacitaGB() {
        return capacitaGB;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setCapacitaGB(int capacitaGB) {
        this.capacitaGB = capacitaGB;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
