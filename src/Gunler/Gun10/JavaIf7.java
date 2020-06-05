package Gunler.Gun10;

import java.util.Scanner;

public class JavaIf7 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının tek mi çift mi olduğunu bulunuz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayı giriniz = ");
        int sayi = oku.nextInt();

        int onlar = (sayi / 10) % 10; // onlar bamağını veriyor

        if (onlar % 2 == 0)
            System.out.println("Çifttir.");

        if (onlar % 2 == 1)
            System.out.println("tektir.");
    }
}
