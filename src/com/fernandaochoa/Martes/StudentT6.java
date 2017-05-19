package com.fernandaochoa.Martes;

//this: that return as a statement from the method
public class StudentT6 {

    public static void main(String[] args) {
        new AC().getAC().msg();
    }
}
class AC {
   public AC getAC(){
        return this;
    }
    void msg(){
        System.out.println("Hola");
    }
}
