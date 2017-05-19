package com.fernandaochoa.Chat.Servidor;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class PrincipalServidor extends JFrame {
    //Instancias Graficas
    public JTextField ingresoMensaje;
    public JTextArea pantallaChat;
    public JMenuItem adjuntar;


    private static String ipCliente;// = "10.0.0.4";

    //Constructor por Default
    public PrincipalServidor() {

        campoTexto();
        centrarChat();
        adjuntarArchivos();

    }

    public void campoTexto() {
        //Campo de Texto en la parte inferior
        ingresoMensaje = new JTextField();
        ingresoMensaje.setEditable(false);
        add(ingresoMensaje, BorderLayout.SOUTH);

    }

    //Hoja del chat centrado
    public void centrarChat() {
        pantallaChat = new JTextArea();
        pantallaChat.setEditable(false);
        add(new JScrollPane(pantallaChat), BorderLayout.CENTER);
        pantallaChat.setBackground(Color.white);
        pantallaChat.setForeground(Color.black);
        ingresoMensaje.setForeground(Color.blue);

    }

    //Crea opciones de Salir y Adjuntar Archivos
    public void adjuntarArchivos() {
        JMenuItem salir = new JMenuItem("Salir");
        adjuntar = new JMenuItem("Adjuntar Archivo");
        adjuntar.setEnabled(false);
        JMenuBar barra = new JMenuBar();
        setJMenuBar(barra);
        barra.add(salir);
        barra.add(adjuntar);

        //Accion que se realiza Salir
        salir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); //Sale de la aplicacion
            }
        });

        //Accion que se realiza Adjuntar Archivo
        adjuntar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser ventanaEscojer = new JFileChooser();
                int seleccion = ventanaEscojer.showOpenDialog(ventanaEscojer);// Se abre el cuadro para escoger el archivo
                String path = ventanaEscojer.getSelectedFile().getAbsolutePath();//Se obtiene la direccion completa del archivo

                //bucle para realizar la comparacion del archivo y poderlo enviar
                if (seleccion == JFileChooser.APPROVE_OPTION) {

                }
            }
        });
        ipCliente = JOptionPane.showInputDialog(null, "Introduzca numero IP del Cliente: ");
        setSize(320, 500);//tamano de la ventana del chat
        setVisible(true); //hace visible a la ventana

    }

    private static void startThread() {
        //Correr los hilos de enviar y recibir
    }

    private static void connectCliente() throws IOException {
        //Conexion con el cliente

    }

    public void mostrarMensaje(String mensaje) {
        pantallaChat.append(mensaje + "\n");
    }

    public void habilitar(boolean editable) {
        ingresoMensaje.setEditable(editable);
        adjuntar.setEnabled(editable);
    }

}