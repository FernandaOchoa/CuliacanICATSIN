package com.fernandaochoa.Miercoles;
/*
    Si una subclase tiene el mismo metodo que se declaro
    en la clase padre, se conoce como redefinicion.

    Si la subclase proporciona la implementacion especifica
    del metodo que ha sido previamente proporcionado en su
    clase padre se conoce como redefinicion del metodo.

    Uso del override en java
        Proporcionar implementaciones especificas a
        metodos heredados
        Proporcionan los mecanismos que permiten el
        polimorfismo
    Reglas para Override
        Mismo nombre que en la clase padre
        Mismo parametro que en la clase padre
        Relacionados IS-A
 */
public class OverrideTest {
    public static void main(String[] args) {
        Bike bici = new Bike();
        bici.run();
    }
}
class Vehiculo {
    void run(){
        System.out.println("El vehiculo esta corriendo");
    }
}
class Bike extends Vehiculo {
    void run(){
        System.out.println("La bicicleta esta corriendo");
    }
}
