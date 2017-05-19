package com.fernandaochoa.Miercoles;

//Ejemplo de herencia

public class Empleado {
    float salario = 4000;
}
class Programador extends Empleado {
    int bono = 10000;

    public static void main(String[] args) {
        Programador p = new Programador();
        System.out.println("El salario de un programador es:" +
                " "+p.salario);
        System.out.println("El bono es "+p.bono);
    }
}
