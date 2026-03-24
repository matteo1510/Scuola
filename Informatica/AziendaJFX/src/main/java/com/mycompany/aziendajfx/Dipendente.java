
package com.mycompany.aziendajfx;

    public class Dipendente {
    
    //attributi
    private String nome;
    private double stipendio;
    
    //costruttore

    public Dipendente(String nome, double stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
    }
    
    //metodi

    public String getNome() {
        return nome;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }
    
    public double aumentoStipendio(int percentuale){
        return stipendio+((stipendio/100)*percentuale);
    }
}

