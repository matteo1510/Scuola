package com.mycompany.costocomputer;

import java.util.*;

public class CostoComputer {

    public static Scanner tastiera=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //dichiarazione
        Cpu cpu1 = new Cpu(180,"andrea",7);
        Ram ram1 = new Ram(100,"nvidia",90);
        Computer computer1 = new Computer("Lenovo",cpu1,ram1);
        
        //richiamo il metodo
        System.out.println(computer1.costoComputer());
    }
}
