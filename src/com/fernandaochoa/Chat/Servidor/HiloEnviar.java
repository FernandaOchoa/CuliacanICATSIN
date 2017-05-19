package com.fernandaochoa.Chat.Servidor;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;

public class HiloEnviar  extends Thread {
    private final PrincipalServidor ventanaServidor;

    private ObjectOutputStream salida;
    private String mensaje;
    private Socket conexion;


    public HiloEnviar(Socket conexion, PrincipalServidor ventanaServidor){
        this.ventanaServidor = ventanaServidor;
        this.conexion = conexion;

        //Evento que ocurre al escribir en el texteArea

        ventanaServidor.ingresoMensaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mensaje = e.getActionCommand();

                enviarMensaje(mensaje);
                ventanaServidor.ingresoMensaje.setText("");
            }
        });
    }
    private void enviarMensaje(String mensaje){

        try {
            salida.writeObject(ventanaServidor.usuario +"dice: "+mensaje);
            salida.flush();
            ventanaServidor.mostrarMensaje("Yo: "+mensaje);
        }catch (IOException ioe){
            ventanaServidor.mostrarMensaje("Se perdio el cliente");
        }

    }
    //manipula areaPantalla en el hilo despachador de eventos
    public void mostrarMensaje(String mensaje) {
        ventanaServidor.pantallaChat.append(mensaje);
    }


    public void run(){

        try {
            salida = new ObjectOutputStream(conexion.getOutputStream());
            salida.flush();
        }catch (SocketException se){
            se.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }catch (NullPointerException npe){
            npe.printStackTrace();
        }

    }
}
