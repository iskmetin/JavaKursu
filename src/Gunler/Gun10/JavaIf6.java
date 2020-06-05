package Gunler.Gun10;

import java.util.Scanner;

public class JavaIf6 {
    public static void main(String[] args) {
        // Girilen 3 sayıdan en büyük olanını bulunuz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz = ");
        int sayi1 = oku.nextInt();

        System.out.print("İkinci sayıyı giriniz = ");
        int sayi2 = oku.nextInt();

        System.out.print("Üçüncü sayıyı giriniz = ");
        int sayi3 = oku.nextInt();

        int enBuyuk = sayi1;

        if (sayi2 > enBuyuk)
            enBuyuk = sayi2;

        if (sayi3 > enBuyuk)
            enBuyuk = sayi3;

        System.out.println("enBuyuk = " + enBuyuk);
    }
}
