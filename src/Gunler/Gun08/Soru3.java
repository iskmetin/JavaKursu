package Gunler.Gun08;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 3 kelimelik ismin her kelimesini
        // ayırarak ayrı ayrı yazdırınız.
        // Örn:  Ahmet Emin Yıldız
        Scanner oku = new Scanner(System.in);
        System.out.print("Adınız ve Soyadınız (3 kelimelik) = ");
        String adAd2Soyad = oku.nextLine();

        int ilkBoslukIndex = adAd2Soyad.indexOf(" ");
        int sonBoslukIndex = adAd2Soyad.lastIndexOf(" ");

        String ad = adAd2Soyad.substring(0, ilkBoslukIndex); // Ahmet
        String ad2 = adAd2Soyad.substring(ilkBoslukIndex + 1, sonBoslukIndex); // Emin
        String soyad = adAd2Soyad.substring(sonBoslukIndex + 1); // Yıldız

        System.out.println("ad = " + ad);
        System.out.println("ad2 = " + ad2);
        System.out.println("soyad = " + soyad);
    }
}
