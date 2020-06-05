package Gunler.Gun10;

import java.util.Scanner;

public class Javaif3 {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanını ekrana yazdırınız, eşit ise eşit yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Birinci Sayıyı giriniz=");
        int sayi1 = oku.nextInt();

        System.out.print("İkinci Sayıyı giriniz=");
        int sayi2 = oku.nextInt();

        if (sayi1 > sayi2) {
            System.out.println("1.Sayı büyüktür : " + sayi1);
            System.out.println("1.Sayı büyüktür : " + sayi1);
        }

        if (sayi2 > sayi1)
            System.out.println("2.Sayı büyüktür : " + sayi2);

        if (sayi1 == sayi2)
            System.out.println("2 sayı da eşittir.");


    }
}
