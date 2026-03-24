package com.mycompany.costruttorecopy;

public class Contatto {
        
    //attributi
    private String nome;
    private String cognome;
    private String telefono;
    
    //costruttori
    public Contatto() {
    }

    public Contatto(String nome, String cognome, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
    }
    
    public Contatto(Contatto c){
        this.nome = c.nome;
        this.cognome = c.cognome;
        this.telefono = c.telefono;
    }
    
    //metodi

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "\nnome: " + this.nome + "\nCognome: " + this.cognome + "\nTelefono: " + this.telefono;
    }
    
    
}
