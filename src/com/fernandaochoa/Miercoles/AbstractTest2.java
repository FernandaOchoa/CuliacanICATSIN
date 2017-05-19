package com.fernandaochoa.Miercoles;

abstract class Shape {
    abstract void draw();
}
//En un escenario real, la implementacion la provee algo mas
class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("drawing rectangles :D");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("drawing circles :D");
    }
}
//En un escenario real, el metodo es llamado por el programador
public class AbstractTest2 {
    public static void main(String[] args) {
        Shape s= new Circle();
        s.draw();
        new Rectangle().draw();
    }
}
