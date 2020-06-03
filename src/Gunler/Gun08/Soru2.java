package Gunler.Gun08;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı şekilde ekrana yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen adınızı ve soyadınız giriniz = ");
        String adSoyad = oku.nextLine();

        // Ahmet Yılmaz    substring(başlangıç index, e kadar - dahil değil)
        int boslukIndex = adSoyad.indexOf(" ");

        String ad = adSoyad.substring(0, boslukIndex);
        String Soyad = adSoyad.substring(boslukIndex + 1);

        System.out.println("ad = " + ad);
        System.out.println("Soyad = " + Soyad);
    }
}
