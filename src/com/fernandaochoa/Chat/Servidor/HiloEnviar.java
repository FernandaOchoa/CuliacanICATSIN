package com.fernandaochoa.Chat.Servidor;


public class HiloEnviar  extends Thread {
    private final PrincipalServidor ventanaServidor;

    public HiloEnviar(PrincipalServidor ventanaServidor){
        this.ventanaServidor = ventanaServidor;
    }
    private void enviarMensaje(String mensaje){

    }
    //manipula areaPantalla en el hilo despachador de eventos
    public void mostrarMensaje(String mensaje) {
        ventanaServidor.pantallaChat.append(mensaje);
    }


    public void run(){

    }
}
