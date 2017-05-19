package com.fernandaochoa.Jueves.carrera;


public class Tortuga extends Thread {
    @Override
    public void run() {
        int i = 0;
        System.out.println("Inicia la tortuga");

        while (i<=5){
            try {
                Thread.sleep(5000);
                System.out.println("Doy un paso");
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }
            i++;
        }
        System.out.println("Ya llego la tortuga");
    }
}
