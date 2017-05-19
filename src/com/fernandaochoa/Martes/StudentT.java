package com.fernandaochoa.Martes;
/*
    This
    Se trata de una variable referencia al objeto actual

     Usos de la palabra reservada this
        a) This puede sere usado para referir a la instancia
        de la clase actual
        b) This se utiliza para invocar el metodo de la
        clase actual (implicitamente)
        c)This() se utiliza para invocar al constructor
        de la clase actual
        d)This se puede pasar como un argumento en la
        llamada al metodo
        e) This puede ser pasado como argumento en la
        llamada al constructor
        f) This se puede utilizar para devolver la instancia
        actual del metodo.

 */
//this: to refer current class instance variable
public class StudentT {
    int noControl;
    String name;
    int edad;

    public StudentT(int noControl, int edad,
                    String name){
        this.noControl = noControl;
        this.name = name;
        this.edad = edad;
    }
}
