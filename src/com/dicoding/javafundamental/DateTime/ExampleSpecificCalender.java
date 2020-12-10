package com.dicoding.javafundamental.DateTime;

import java.util.Calendar;

public class ExampleSpecificCalender {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        // menampilkan waktu sekarang
        System.out.println("Tanggal : " + calendar.getTime());

        // Waktu Lima hari yang lalu
        calendar.add(Calendar.DAY_OF_MONTH, -5);
        System.out.println("Tanggal 5 Hari Lalu : "+ calendar.getTime());

        // waktu 2 tahun yang lalu
        calendar.add(Calendar.YEAR, -2);
        System.out.println("2 Tahun yang lalu : "+ calendar.getTime());




    }
}
