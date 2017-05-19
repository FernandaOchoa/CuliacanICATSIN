package com.fernandaochoa.Viernes.sockets1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("localhost",6666);
        DataOutputStream dout =
                new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Hola servidor");
        dout.flush();
        dout.close();
        s.close();

    }
}
