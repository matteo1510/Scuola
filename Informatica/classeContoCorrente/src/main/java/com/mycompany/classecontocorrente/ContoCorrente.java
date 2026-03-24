package com.mycompany.classecontocorrente;

public class ContoCorrente {
    
    //attributi
    private float saldo;
    
    //costruttore
    public ContoCorrente() {
    }
    
    //metodi

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void preleva(float n){
        this.saldo = saldo - n;
    }
    
    public void versa(float n){
        this.saldo = saldo + n;
    }
}
