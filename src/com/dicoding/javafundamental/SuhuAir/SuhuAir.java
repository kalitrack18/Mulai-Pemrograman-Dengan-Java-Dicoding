package com.dicoding.javafundamental.SuhuAir;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {
        /* contoh pemakaian IF tiga kasus : wujud air */

        /* Kamus */
        int T;

        // Program
        System.out.println("Contoh IF tiga kasus");
        System.out.print("Suhu(der. C ) = ");


        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt(); // masukkan suhu air dengan tipe integer

        // proses pengecekan air
        // beku,  air cair, panas/uap

        if (T < 0 ){
            System.out.println("Air dalam keadaan dingin / beku" + T);
        }else if ((0 <=T) && (T <= 100)){
            System.out.println("Wujud air Cair "+ T);
        }else if (T > 100){
            System.out.println("Wujud Air gas / uap "+ T);
        }
    }
}
