package Gunler.Gun12;

import java.util.Scanner;

public class JavaTernary4 {
    public static void main(String[] args) {
        //Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini ekrana yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("sayi =");
        int sayi = oku.nextInt();

        int sonuc = sayi > 50 ? 1 : 0;

        System.out.println("sonuc = " + sonuc);
    }
}
