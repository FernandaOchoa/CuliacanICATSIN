package com.fernandaochoa.Jueves.carrera;


public class Liebre implements Runnable {
    public void run(){
        int i = 0;
        System.out.println("Inicia la liebre");
        while (i<=5){
            try {
                Thread.sleep(2000);
                System.out.println("la liebre da un paso");
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }
            i++;
        }
        System.out.println("Termina la liebre");
    }
}
