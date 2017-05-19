package com.fernandaochoa.Martes;

//this: to pass as argument in the constructor class
public class StudentT5 {
    Student1 obj;

    StudentT5(Student1 obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj.id);
    }
}

class Student1 {
    int id = 10;

    Student1() {
        StudentT5 s5 = new StudentT5(this);
        s5.display();
    }

    public static void main(String args[]) {
        Student1 s1 = new Student1();
    }
}


