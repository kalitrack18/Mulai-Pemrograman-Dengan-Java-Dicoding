package com.dicoding.javafundamental.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleSimpleDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        String dateFormat = sdf.format(new Date());

        System.out.println("FormatDateDefault : " + new Date());

        System.out.println("Format tanggal dengan format : " + dateFormat);
    }
}
