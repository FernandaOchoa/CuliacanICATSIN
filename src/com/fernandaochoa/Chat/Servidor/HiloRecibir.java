package com.fernandaochoa.Chat.Servidor;


public class HiloRecibir extends Thread {
    private final PrincipalServidor ventanaServidor;

    //Constructor del Hilo
    public HiloRecibir(PrincipalServidor ventanaServidor) {
        this.ventanaServidor = ventanaServidor;

        //Evento que ocurre al escribir en el areaTexto

    }

    public void mostrarMensaje(String mensaje) {
        ventanaServidor.pantallaChat.append(mensaje);
    }

    public void run() {
        ventanaServidor.mostrarMensaje("Fin de la conexion");
    }

}
