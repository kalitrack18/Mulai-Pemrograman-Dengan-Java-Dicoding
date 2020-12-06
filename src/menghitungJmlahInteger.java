import java.util.Scanner;

public class menghitungJmlahInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Angka : ");
        int angka = scanner.nextInt();

        System.out.println("JUmlah Digit = "+ JumlahDigit(angka));



    }

    public static int JumlahDigit(int angka){
        int jumlah = 0;

        while (angka !=0){
            jumlah = jumlah + angka % 10;

            angka = angka / 10;
        }

        return jumlah;
    }
}
