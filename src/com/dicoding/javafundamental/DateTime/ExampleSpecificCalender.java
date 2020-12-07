package com.dicoding.javafundamental.DateTime;

import java.util.Calendar;

public class ExampleSpecificCalender {
    public static void main(String[] args) {
        // Menampilkan Waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu Sekarang : "+ calendar.getTime());

        // Menampilkan waktu lima hari yang lalu
        calendar.add(Calendar.DATE, -5);
        System.out.println("Waktu Lima hari yang lalu : " + calendar.getTime());

        // Menam
        calendar.add(Calendar.MONTH, 5);
        System.out.println("Waktu Lima Bulan Kemudian"+ calendar.getTime());




    }
}
