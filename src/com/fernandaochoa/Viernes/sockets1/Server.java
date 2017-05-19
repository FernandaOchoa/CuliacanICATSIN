package com.fernandaochoa.Viernes.sockets1;
/*
    Networking es un concepto de conectividad entre 2
    o mas dispositivos juntos, que comparten recursos

    La programacion de sockets proporciona la facilidad
    para compartir datos entre diferentes dispositivos

    Ventajas de Networking en Java
        Compartir recursos
        Centralizar la gestion del software

    Conceptos:
        Direccion IP: Numero dinamico asignado a un nodo de
        una red compuesto por octetos que van del 0 al 255
        Es una direccion logica que puede ser cambiada

        Protocolo: Conjunto de reglas que se establecen para
        la comunicacion. EJ: FTP, TCP, Telnet, SMTP, POP, etc.

        MAC:(Media Access Control) Indentificador unico de NIC
        NIC(Network Interface Controller). Un nodo de red puede
        tener multiples NIC, pero solo un MAC unico.
        Direccion física estática.

        Protocolo Orientado a la Comunicacion
            Connection - Oriented

            Es un protocolo de tipo TCP, tcp/ip, confiable pero
            lento. El acuse de recibo es enviado por el receptor.

            Connection-Less
            El receptor no envia el acuse de recibo.
            Es rapido, sin embargo no es confiable. EJ UDP

       Socket: Punto final en una conexion Bidireccional

            La programacion de sockets se utiliza para la
            comunicacion entre las aplicaciones que se
            ejecutan  entre diferentes aplicaciones JRE.
            Java Runtime Enviroment

            La programacion de sockets puede ser orientada a
            conexion o sin conexion.

            Las clases Java Socket y ServerSocket
            Son usadas para la programacion orientada a la comunicacion

            Las clases Java Socket y ServerSocket
            Connection Oriented

            Las clases DatagramSocket y DatagramPacket
            Connection Less

            El cliente del socket necesita saber:
                IP Address del Server
                Port Number
                Socket Class

           Socket Class

           Metodos
                public InputStream getInputStream()
                    regresa el is adjunto con el socket
                public OutputStream getOutputStream()
                    regresa el os adjunto al socket
                public synchronized void close()
                    cerrar el socket

           Server Socket
           Metodos
                public Socket accept()
                    Establece la conexion entrante
                oblic synchronized void close()
                    Cierra la conexion.
 */

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();

        DataInputStream dis =
                new DataInputStream(s.getInputStream());
        String str = (String)dis.readUTF();
        System.out.println("Mensaje: "+str);

        ss.close();
    }
}
