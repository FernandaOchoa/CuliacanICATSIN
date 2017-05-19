package com.fernandaochoa.Jueves;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO {
    public static void main(String[] args) {
        try{
            FileOutputStream fos =
                    new FileOutputStream("C:\\hola.txt");
            fos.write(65);
            fos.close();

            FileInputStream fis =
                    new FileInputStream("C:\\hola.txt");

            BufferedInputStream bin =
                    new BufferedInputStream(fis);

            int i;
            while((i=bin.read())!= -1){
                System.out.println((char)i);
            }
            bin.close();
            fis.close();

        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}
