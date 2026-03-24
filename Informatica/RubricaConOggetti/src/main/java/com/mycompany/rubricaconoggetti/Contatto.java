package com.mycompany.rubricaconoggetti;

public class Contatto {
    
    //attributi
    private String nome;
    private String cognome;
    private String telefono;
    
    //costruttore
    public Contatto(String nome, String cognome, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
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
