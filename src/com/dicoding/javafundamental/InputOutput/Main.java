package com.dicoding.javafundamental.InputOutput;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String dirname = "D://javalatihan1";
        File file = new File(dirname);

        String[] path;

        try{
            // Instansiasi objek file
            file = new File( dirname);

            // ambil list files dan masukkan kedalam paths
            path = file.list();

            // tampilkan semua path
            for (String paths : path){
                System.out.println(paths);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
