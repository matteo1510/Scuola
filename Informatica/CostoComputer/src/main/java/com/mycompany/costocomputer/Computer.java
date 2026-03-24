package com.mycompany.costocomputer;

public class Computer {
    
    //attributi
    private String marca;
    private Cpu cpu;
    private Ram ram;
    
    //costruttore

    public Computer(String marca, Cpu cpu, Ram ram) {
        this.marca = marca;
        this.cpu = cpu;
        this.ram = ram;
    }
    
    //metodi
    public String getMarca() {
        return marca;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }
    
    public double costoComputer(){
        return cpu.getPrezzo()+ram.getPrezzo();
    }
}
