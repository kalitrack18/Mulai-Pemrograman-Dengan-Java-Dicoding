package com.dicoding.javafundamental.DateTime;

public class ExampleCurrentTimeMillis {
    public static void main(String[] args) {
        /**
         * menggunakan System.currentTImeMillis(); kita dapat menyimpan waktu yang bertipe data long.
         */
        long timeNow = System.currentTimeMillis();

        System.out.println("Waktu sekarang adalah : " + timeNow + " milisecond");
    }
}
