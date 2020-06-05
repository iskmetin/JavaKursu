package Gunler.Gun10;

import java.util.Scanner;

public class JavaIf4 {
    public static void main(String[] args) {
        // girilen bir sayının tek mi çift mi olduğunu yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz=");

        int sayi = oku.nextInt();

        if (sayi % 2 == 0)
            System.out.println("Sayı çifttir");

        if (sayi % 2 == 1)
            System.out.println("Sayı tektir.");


        if (sayi % 2 == 0) {
            System.out.println("Sayı çifttir");
        }

        if (sayi % 2 == 1) {
            System.out.println("Sayı tektir.");
        }


    }
}
