package com.fernandaochoa.Martes;

//this: to invoke current class method
public class StudentT2 {

    public static void main(String[] args) {
        Saludos s1 = new Saludos();
        s1.tambienSaluda();
    }
}
class Saludos {
    public void saludar(){
        System.out.println("Hola");
    }
    public void tambienSaluda(){
        System.out.println("Yo tambien saludo");
        this.saludar();
    }
}
