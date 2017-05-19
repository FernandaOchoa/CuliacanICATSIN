package com.fernandaochoa.Miercoles;


public class Persona {
    int id;
    String name;
    Persona (int id, String name){
        this.id = id;
        this.name = name;
    }
}
class Empleado2 extends Persona {
    float salario;
    Empleado2(int id, String name, float salario){
        super(id, name);
        this.salario = salario;
    }
    void display(){
        System.out.println(id+" "+name+" "+salario);
    }
}
class PersonaTest {
    public static void main(String[] args) {
        Empleado2 e = new Empleado2(001,"Fer",12500f);
        e.display();
    }
}