package com.dicoding.javafundamental.InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {
    public static void main (String[] args){
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("Latihant_input.txt");
            out = new FileOutputStream("Latihant_output.txt");
            int c;

            while ((c = in.read()) != -1){
                out.write(c);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                if (in != null){
                    in.close();
                }if (out != null){
                    out.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
