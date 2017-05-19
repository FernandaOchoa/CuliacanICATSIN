package com.fernandaochoa.Miercoles;
/*
    Una interfaz es un plano de una clase
    Tiene constantes estaticas y metodos abstractos
    Es un mecanismo que permite la abstraccion
    Solo puede contener metodos abstractos
    Permite la herencia multiple
    No se puede instanciar como una clase abstracta

    Razones para usar una interface
        Por interface podemos apoyar la funcionalidad de
        herencia multiple.
        Se utiliza para lograr el desacoplamiento
    *Java 8: Puede contener metodos predeterminados estaticos
 */

interface show {
    void print();
}

public class InterfaceTest implements show {
    public void print(){
        System.out.println("Hola");
    }

    public static void main(String[] args) {
        InterfaceTest a = new InterfaceTest();
        a.print();
    }
}

