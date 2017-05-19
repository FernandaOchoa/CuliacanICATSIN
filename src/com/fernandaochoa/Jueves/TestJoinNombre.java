package com.fernandaochoa.Jueves;


public class TestJoinNombre extends Thread {

    @Override
    public void run() {
        System.out.println("Corriendo");
    }

    public static void main(String[] args) {
        TestJoinNombre t1 = new TestJoinNombre(),
                t2 = new TestJoinNombre(),
                t3 = new TestJoinNombre();

        System.out.println("El nombre del hilo 1: "+
        t1.getName());
        System.out.println("El nombre del hilo 2: "+
                t2.getName());
        System.out.println("El nombre del hilo 3: "+
                t3.getName());

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

        t1.setName("Hilo A");
        t2.setName("Hilo B");
        t3.setName("Hilo C");

        System.out.println("Ahora el nombre del hilo 1: "+
                t1.getName());
        System.out.println("Ahora el nombre del hilo 2: "+
                t2.getName());
        System.out.println("Ahora el nombre del hilo 3: "+
                t3.getName());
    }
}

