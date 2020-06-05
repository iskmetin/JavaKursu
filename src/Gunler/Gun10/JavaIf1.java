package Gunler.Gun10;

import java.util.Scanner;

public class JavaIf1 {
    public static void main(String[] args) {
        // Girilen bir sayının 10 dan büyük ise ekrana 10 dan büyük diye yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        int sayi = oku.nextInt();

        if (sayi > 10) {  // if in içinde yapılacaklar 1 satırdan fazla ise süslü parantez şart.1 tane ise değil
            System.out.println("Girilen sayı 10 dan büyüktür");
        }

    }
}
