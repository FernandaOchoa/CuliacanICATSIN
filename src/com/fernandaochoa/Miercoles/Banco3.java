package com.fernandaochoa.Miercoles;


/*
    Abstract
        Tiene metodos abstractos y no abstractos
        Usa la palabra reservada abstract
        Puede proveer la implementacion de una interface
        No soporta la herencia multiple
        Puede tener variables estaticas, finales, no finales y
        no estaticas.
    Interface
        Solo puede contener metodos abstractos y en J8 tiene
         metodos default y estaticos
        Soporta la herencia multiple
        Solo tiene variables estaticas y finales
        No puede proveer la implementacion de una clase abstracta
        Usa la palabra reservada interface
 */
interface Banco3 {
    float rangoDeInteres();
}

class BanCoppel3 implements Banco3 {
    public float rangoDeInteres() {
        return 7f;
    }
}

class Bancomer3 implements Banco3 {
   public float rangoDeInteres() {
        return 9f;
    }
}

class HSBC3 implements Banco3 {
    public float rangoDeInteres() {
        return 8f;
    }
}

class PruebaBanco3 {
    public static void main(String[] args) {
        Banco3 b;
        b = new BanCoppel3();
        System.out.println("La tasa de interes: " + b.rangoDeInteres());
        b = new Bancomer3();
        System.out.println("La tasa de interes: " + b.rangoDeInteres());
        b = new HSBC3();
        System.out.println("La tasa de interes: " + b.rangoDeInteres());
    }
}

