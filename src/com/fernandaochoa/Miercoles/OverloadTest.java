package com.fernandaochoa.Miercoles;

/*
    Si una clase tiene varios metodos que tienen el mismo
    nombre pero diferentes en parametros, se conoce como
    sobrecarga.
    Si tenemos que realizar una sola operacion, tener el
    mismo nombre de los metodos aumenta la legibilidad del
    programa.
    Ventajas:
        AUmenta la legibilidad del programa
        Diferentes maneras de sobrecargar un metodo
    Formas de Sobrecargar un metodo
        Cambiando el numero de Argumentos
        Cambiando el tipo de datos
 */
public class OverloadTest {
    public static void main(String[] args) {
        System.out.println(AddArguments.add(11,23));
        System.out.println(AddArguments.add(23,14,19));

        System.out.println(AddType.add(11,22));
        System.out.println(AddType.add(12.3,12.6));
    }

    public static void main(String args) {
        System.out.println("main sin String[]");
    }

    public static void main() {
        System.out.println("main sin args");
    }
}
class AddArguments {
    static int add (int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}

class AddType {
    static int add(int a, int b){
        return  a+b;
    }
    static double add (double a, double b){
        return a+b;
    }
}
