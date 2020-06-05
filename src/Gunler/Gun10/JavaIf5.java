package Gunler.Gun10;

import java.util.Scanner;

public class JavaIf5 {
    public static void main(String[] args) {
        // Girilen bir sayının birler basamağını yazı ile yazdırınız
        // Soru : yukarıdaki soru - sayı ise çalışmadı, - olması durumunda da çalışmasını
        // nasıl sağlarsınız

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        int sayi = oku.nextInt();

        if (sayi < 0)  // bu bölüm sayı negatifse çalışacak
            sayi = sayi * -1; // sayi =-sayi;

        int birler = sayi % 10;

        if (birler == 0) {
            System.out.println("sıfır");
            System.out.println("0");
        }
        if (birler == 1) System.out.println("bir");
        if (birler == 2) System.out.println("iki");
        if (birler == 3) System.out.println("üç");
        if (birler == 4) System.out.println("dört");
        if (birler == 5) System.out.println("beş");
        if (birler == 6) System.out.println("altı");
        if (birler == 7) System.out.println("yedi");
        if (birler == 8) System.out.println("sekiz");
        if (birler == 9) System.out.println("dokuz");
    }
}
