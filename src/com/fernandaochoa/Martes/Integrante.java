package com.fernandaochoa.Martes;
/*
    Constructor                          |   Metodo
    Se usa para inicializar un objeto       Es usado para explicar el comportamiento de un objeto
    No tiene un tipo de retorno             Tiene un valor de retorno
    Es invocado implicitamente              Es invocado explicitamente
    El compilador de java provee un         No lo provee ni el compilador ni la clase
    constructor por default si no tiene     Puede tener o no la misma signatura de la clase que lo
    uno                                     contiene
    Constructor debe contener la misma
    signatura de la clase
 */

public class Integrante {

    int id;
    String nombre;

    public Integrante(int i, String n){
        id = i;
        nombre = n;
    }
    public Integrante(Integrante in){
        id = in.id;
        nombre = in.nombre;
    }
    public void display(){
        System.out.println(id+" "+nombre);
    }
    public Integrante(){

    }

    public static void main(String[] args) {
        Integrante i1= new Integrante(001,"Fer");
        Integrante i2 = new Integrante(i1);

        i1.display();
        i2.display();
    }

}
