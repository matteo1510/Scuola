
package com.mycompany.metodoequals;

/**
 *
 * @author matte_hsnnuqj
 */
public class Metodoequals {

    public static void main(String[] args) {
        System.out.println("Metodo Equals");
        Persona p1=new Persona("matteo","pibiri","italia");
        Persona p2=new Persona("sara","bono","italia");
        
        System.out.println(p1.equals(p2));
    }
}
