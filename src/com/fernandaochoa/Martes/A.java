package com.fernandaochoa.Martes;
/*
    Existen dos restricciones principales de un metodo
    estatico
        a) No puede utilizar un dato no estatico o llamar
        directamente al metodo no estatico
        b) This y Super no se pueden utilizar en un contexto
        estatico.
 */

public class A {
   static int a = 40;

    public static void main(String[] args) {
        System.out.println(a);
    }
}
