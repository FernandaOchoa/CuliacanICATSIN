package com.fernandaochoa.Jueves;
/*
    (Paralelismo) Multihilos en Java: Es el proceso para ejecutar
    muchos hilos de manera simultanea
    Hilo: Subproceso ligero, unidad muy pequeña de procesamiento
    (Concurrencia) Multiprocesamiento y Multihilo se utilizan
    para lograr la multitarea, en la concurrencia pueden o no ser
    multiprocesamiento

    Ventajas de usar Hilos
        1.- No bloqueamos al usuario por que son tareas independientes y
        se pueden realizar muchas tareas al mismo tiempo.
        2.- Podemos realizar muchas tareas al mismo tiempo.
        3.- Los hilos al ser independientes no se afectan entre si, en
        caso de ocurrir una excepcion en un hilo los demas funcionan
        igual.

    Multitarea: Proceso de ejecucion de muchas tareas,Usamos la multitarea
     para utilizar el CPU. La multitarea se logra de dos maneras.
        1.- Multitarea basada en procesos. (Multiproceso)
            *Cada proceso tiene su propoia direccion en memoria,
            * es decir, cada proceso asgna un area separada de memoria.

            *El proceso es pesado.
             * El costo de la comunicacion entre el proceso es alto.
              * Cambiar de un proceso a otro requiere de tiempo para guardar
              * y cargar registros, mapas de memoria, listas de actualizacion
              * etc.
              *
         2.- Multitare basada en hilos (Multihilos)
            *Los hilos comparten los mismos espacios en memoria para
            * direcciones.
            * El hilo es ligero
            * El costo de comunicacion entre hilos es bajo.
            *
       Un hilo es un subproceso ligero, es independiente, si se produce
       una excepcion en un hilo no afecta a los demas hilos y comparten un
       area de memoria en comun.

       Ciclo de vida de un hilo
            1.-New: El hilo esta en este estado, si se crea una instancia
            de la clase Thread pero antes de la invocacion del metodo
            start().
            2.- Runnable: El hilo esta en este estado, despues de la
            invocacion del metodo statrt(), pero el thread Scheduler
            (Administrador de Hilos) no lo ha seleccionado como el hilo
            en ejecucion.
            3.- Running: El hilo esta aqui cuando el Thread Scheduler lo ha
            seleccionado.
            4.-Non-Runnable (Blocked): Es el estado cuando el hilo sigue activo,
            sin embargo no es apto para ejecutarse.
            5.- Terminated: Es el estado cuando ha finalizado o muerto,
            cuando sale del metodo run().

    Hay 2 formas de crear un hilo:
               1: Al extender de la clase Thread
               2: Al implementar la interface Runnable.

    Clase Thread
    Proporciona los constructores y metodos para crear y realizar
    operaciones en un hilo. La clase Thread extiende de la clase
    Object e implementa la interface Runnable.

        Constructores de la clase Thread
            Thread()
            Thread(String name)
            Thread(Runnable r)
            Thread(Runnable r, String name)
    Runnable
            La interfaz Runnable debe ser implementada por cualquier
            clase cuyas instancias esten destinadas a ser ejecutadas
            por un hilo.
            La interfaz Runnable tiene un solo metodo denominado
            run()
            public void run(): es usado para realizar las operaciones
            del hilo.

 */

public class HilosT extends Thread {
    public void run(){
        System.out.println("Soy un hilo corriendo");
    }

    public static void main(String[] args) {
        HilosT t1 = new HilosT();
        t1.start();

        Hilos t = new Hilos();
        Thread thread = new Thread(t);
        thread.start();
    }
}
class Hilos implements Runnable {
    public void run(){
        System.out.println("Hilo dos esta corriendo");
    }
}
