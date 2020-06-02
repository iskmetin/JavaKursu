package Gunler.Gun06;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 2 sayının toplamını ekrana yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz=");
        int sayi1 = oku.nextInt();
        System.out.print("İkinci sayıyı giriniz=");
        int sayi2 = oku.nextInt();

        int toplam = sayi1 + sayi2;
        System.out.println("Toplam = " + toplam);  // bu şekilde de olur

        System.out.println("Toplam = " + sayi1 + sayi2); // burada string le sayı toplandığından
        // println hepsini stringe çevirip yanyana ekler , sayı toplaması yapmaz

        System.out.println("Toplam = " + (sayi1 + sayi2)); // Paarnteze alırsak önce parantez
        // içi, dolayısıyla sayılar toplanabilir oluyor, sonra sonucu string olarak ekrana basılıyor
    }
}
