package Odevler.haziran11;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        //1-  Girilen 10 adet sayıdan tek olanları ve çift olanların miktarlarını ayrı ayrı bularak yazdırınız.
        Scanner oku = new Scanner(System.in);
        int sayi;
        int count = 0;
        int ciftToplam = 0;
        int ciftAdet = 0;
        int tekAdet = 0;
        int tekToplam = 0;
        do {
            System.out.print("Sayı giriniz= ");
            sayi = oku.nextInt();
            if (sayi % 2 == 0) {
                ciftToplam = ciftToplam + sayi;
                ciftAdet++;
            } else {
                tekToplam = tekToplam + sayi;
                tekAdet++;
            }
            count++;
        } while (count < 10);

        System.out.println(ciftAdet + " tane cift sayi girdiniz.cift sayilar toplami " + ciftToplam);
        System.out.println(tekAdet + " tane cift sayi girdiniz.tek sayilar toplami " + tekToplam);
    }


}

