package com.dicoding.javafundamental.Exception;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    /**
     * Exception adalah event (kejadian) yang mengacaukan jalannya suatu program. Worst case scenario ketika suatu
     * program mengalami exception termination. Termination (penutupan) program adalah hal yang harus dihindari. Untuk
     * itu kita harus menangani exception yang terjadi di program, atau yang biasa disebut sebagai handle exception.
     *
     * Kode yang baik adalah yang terhindar dari segala bentuk kejadian yang menyebabkan efek buruk kepada program.
     * oleh karena itu mari kita kenali dulu berbagai macam exception yang ada di java
     *
     * Pada dasarnya ada 3 jenis exception berdasarkan kategorinya.
     *
     * 1.   Checked Exception, adalah exception yang terjadi saat compile time. Disini programmer harus menambahkan
     *      kode untuk menghandle exception kategori ini. Jika tidak di handle maka kode yang dituliskan akan error dan tidak akan
     *      bisa di kompilasi. Contohnya adalah exception java.io.FileNotFoundException
     * 2.   Unchecked Exception, adalah exception yang terjadi saat execution time. Error ini terjadi dalam lingkup
     *      dari aplikasi kita, biasanya terjadi karena salah penulisan kode atau penggunaan salah terhadap satu API. Contohnya
     *      adalah NUllPointerException.
     * 3.   Error, adalah exception yang diluar kendali user atau programmer. Error ini terjadi di lingkup eksternal dari aplikasi
     *      kita. Ketika exception ini terjadi maka tidak ada yang bisa kita lakukan untuk mengatasinya, Contohnya ketika perangkat kerasnya
     *      rusak saat kita ingin membaca data.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // mengambil data file yang akan di baca
        String file = "D://mcb.txt";
        try {
            //membaca file
            File callFile = new File(file);
            Scanner fileReader = new Scanner(callFile);

            while (fileReader.hasNextLine()){
            String data = fileReader.nextLine();
            System.out.println(data);
            }

        }catch (Exception e){
            System.out.println("Terjadi kesalahan " + e.getMessage());
            e.printStackTrace();
        }




    }
}
