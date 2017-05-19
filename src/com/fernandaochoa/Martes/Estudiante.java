package com.fernandaochoa.Martes;

/*
 Objeto: Entidad del mundo real que posee tres
 caracteristicas: comportamiento, estado, identidad.

 Estado: Representa el valor de un objeto
 Comportamiento: Representa la funcionalidad que posee
 el objeto
 Identidad: Un objeto es tipicamente implementado con un ID
 El valor del id no es visible para el usuario final, pero
 es usado internamente por la JVM, para identificar cada objeto
 de manera unica.

 Un objeto es una instancia de una clase.

 CLASE. es un grupo de objetos que tiene propiedades comunes.
 Es una platilla para modelar los objetos que se crean.
 Una clase contiene:
    campos
    metodos
    constructores
    bloques
    clases anidadas e interfaces
*/

public class Estudiante {
    int id= 1; // Campo o dato o una instancia
    String name="Fer";

    public static void main(String[] args) {
        //Creando un objeto de estudiante
        Estudiante s1 = new Estudiante();
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno(002, "Liz");

        //Accesando al objeto al que hace referencia
        System.out.println(s1.id);
        System.out.println(s1.name);

        a1.inicializarVariable(001,"Fer");
        a1.mostrar();
        a2.mostrar();


    }

}
//Inicializacion por Referencia
class Alumno {
    int id;
    String name;

    public void inicializarVariable(int id, String n){
        this.id = id;
        name = n;
    }
    public void mostrar(){
        System.out.println(id+" "+name);
    }

    public Alumno (){

    }
    public Alumno(int id, String name){
        this.id = id;
        this.name = name;

    }
}


