package com.dicoding.javafundamental.DateTime;

import java.util.Calendar;

public class ExampleSplitCalender {
    public static void main(String[] args) {
        // menampikan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu Sekarang : " + calendar.getTime());


        // menampilkan waktu secara terpisah
        System.out.println("Tanggal : " + calendar.get(Calendar.DATE));
        System.out.println("Bulan : " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun : " + calendar.get(Calendar.YEAR));

    }
}
