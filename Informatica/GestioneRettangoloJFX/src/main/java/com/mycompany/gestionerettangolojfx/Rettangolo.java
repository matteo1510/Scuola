package com.mycompany.gestionerettangolojfx;

public class Rettangolo {
    
    //attributi
    private double latoLungo;
    private double latoCorto;
    
    //costruttore

    public Rettangolo(double latoLungo, double latoCorto) {
        this.latoLungo = latoLungo;
        this.latoCorto = latoCorto;
    }
    
    //metodi

    public double getLatoLungo() {
        return latoLungo;
    }

    public double getLatoCorto() {
        return latoCorto;
    }

    public void setLatoLungo(double latoLungo) {
        this.latoLungo = latoLungo;
    }

    public void setLatoCorto(double latoCorto) {
        this.latoCorto = latoCorto;
    }
    
    public double area(){
        return this.latoCorto * this.latoLungo;
    }
    
    public double perimetro(){
        return 2*(this.latoCorto + this.latoLungo);
    }
    
    public double diagonale(){
        double pitagora = Math.pow(this.latoCorto,2) + Math.pow(this.latoLungo,2);
        return  Math.sqrt(pitagora);
    }
}