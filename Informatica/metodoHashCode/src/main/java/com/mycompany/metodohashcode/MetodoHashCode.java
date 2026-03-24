package com.mycompany.metodohashcode;

public class MetodoHashCode {

    public static void main(String[] args) {
        Persona p1=new Persona("Matteo","Pibiri","italia");
        Persona p2=new Persona("Matte","Pibiri","italia");
        
        
        
        if(p1.hashCode()==p2.hashCode()){
            System.out.println("uguale");
        }else{
            System.out.println("diverso");
        }
    }
}
