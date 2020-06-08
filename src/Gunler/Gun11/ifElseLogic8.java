package Gunler.Gun11;

import java.util.Scanner;

public class ifElseLogic8 {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz = ");
        int sayi1 = oku.nextInt();

        System.out.print("2.Sayıyı giriniz = ");
        int sayi2 = oku.nextInt();

        System.out.println("Toplam için T\nÇıkrma için Ç\nÇarpma için P\nBölme için B ye\n basınız.");
        Scanner oku2 = new Scanner(System.in);
        String islem = oku2.next();

        if (islem.equalsIgnoreCase("T"))
            System.out.println("toplam = " + (sayi1 + sayi2));
        else if (islem.equalsIgnoreCase("Ç"))
            System.out.println("Çıkarma = " + (sayi1 - sayi2));
        else if (islem.equalsIgnoreCase("P"))
            System.out.println("Çarpma = " + (sayi1 * sayi2));
        else if (islem.equalsIgnoreCase("B"))
            System.out.println("Bölme = " + (sayi1 / sayi2));
    }
}
