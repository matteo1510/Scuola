package com.mycompany.classepersona;

public class Persona {
    //attributi
    private String nome;
    private String cognome;
    private String nazionalita;

    //costruttori
    public Persona(String nome, String cognome, String nazionalita) {
        this.nome = nome;
        this.cognome = cognome;
        this.nazionalita = nazionalita;
    }

    //metodi
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }
    
    
}
