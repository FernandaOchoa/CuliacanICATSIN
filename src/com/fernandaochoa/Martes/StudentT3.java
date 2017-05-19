package com.fernandaochoa.Martes;

//this to invoke current class constructor
public class StudentT3 {
    public static void main(String[] args) {
        AB ab = new AB(10);
    }
}
class AB {
    AB(){
        System.out.println("hola soy un mensaje en el " +
                "constructor");
    }
    AB(int x){
        this();
        System.out.println(x);
    }

}
