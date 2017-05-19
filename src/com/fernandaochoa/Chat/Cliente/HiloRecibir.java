package com.fernandaochoa.Chat.Cliente;


public class HiloRecibir extends Thread {
    private final PrincipalCliente ventanaCliente;
    private String mensaje;

    //Constructor del Hilo
    public HiloRecibir(PrincipalCliente ventana) {
        this.ventanaCliente = ventana;
    }

    //metodo para mostrar el mensaje
    public void mostrarMensaje(String mensaje) {
        ventanaCliente.pantallaChat.append(mensaje);
    }

    public void run() {

        ventanaCliente.mostrarMensaje("Fin de la conexion");
    }

}
