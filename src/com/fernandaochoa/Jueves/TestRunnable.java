package com.fernandaochoa.Jueves;


public class TestRunnable {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                show();
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                show2();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

    }

    public static void show(){
        System.out.println("Tarea 1");
    }
    public static void show2(){
        System.out.println("Tarea 2");
    }
}
