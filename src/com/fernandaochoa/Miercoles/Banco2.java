package com.fernandaochoa.Miercoles;

abstract class Banco2 {
    abstract float rangoDeInteres();
}

class BanCoppel2 extends Banco2 {
    float rangoDeInteres() {
        return 7f;
    }
}

class Bancomer2 extends Banco2 {
    float rangoDeInteres() {
        return 9f;
    }
}

class HSBC2 extends Banco2 {
    float rangoDeInteres() {
        return 8f;
    }
}

class PruebaBanco2 {
    public static void main(String[] args) {
        Banco2 b;
        b = new BanCoppel2();
        System.out.println("La tasa de interes: " + b.rangoDeInteres());
        b = new Bancomer2();
        System.out.println("La tasa de interes: " + b.rangoDeInteres());
        b = new HSBC2();
        System.out.println("La tasa de interes: " + b.rangoDeInteres());
    }
}

