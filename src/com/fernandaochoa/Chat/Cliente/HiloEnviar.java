package com.fernandaochoa.Chat.Cliente;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HiloEnviar extends Thread {

    private final PrincipalCliente ventanaCliente;
    private String mensaje;


    //Constructor
    public HiloEnviar(final PrincipalCliente ventana) {

        this.ventanaCliente = ventana;

        //Evento que ocurre al escribir en el areaTexto
        ventanaCliente.ingresoMensaje.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                mensaje = event.getActionCommand();
                enviarMensaje(mensaje); //se envia el mensaje
                ventanaCliente.ingresoMensaje.setText(""); //el area donde se ingresa el texto se lo borra para poder ingresar el nuevo texto
            }
        });
    }

    //enviar objeto a cliente
    private void enviarMensaje(String mensaje) {

        ventanaCliente.mostrarMensaje("YO: " + mensaje);

        ventanaCliente.mostrarMensaje("Servidor Perdido");

    }

    //manipula areaPantalla en el hilo despachador de eventos
    public void mostrarMensaje(String mensaje) {
        ventanaCliente.pantallaChat.append(mensaje);
    }

    public void run() {
    }

}
