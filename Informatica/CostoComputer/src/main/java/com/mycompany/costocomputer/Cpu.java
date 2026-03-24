package com.mycompany.costocomputer;

public class Cpu {
    //attributi
    private double prezzo;
    private String modello;
    private int core;
    
    //costruttore
    public Cpu(double prezzo, String modello, int core) {
        this.prezzo = prezzo;
        this.modello = modello;
        this.core = core;
    }
    
    //metodi
    public double getPrezzo() {
        return prezzo;
    }

    public String getModello() {
        return modello;
    }

    public int getCore() {
        return core;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setCore(int core) {
        this.core = core;
    }
}
