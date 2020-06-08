package Gunler.Gun11;

import java.util.Scanner;

public class ifElse1 {
    public static void main(String[] args) {
        // Girilen bir öğrencinin notuna göre 50 den büyük ise geçtiniz,
        // küçük ise kaldınız yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Notu giriniz=");
        int ogrNot = oku.nextInt();

        if (ogrNot >= 50) {
            System.out.println("Geçtiniz.");
            System.out.println("Tebrikler");
        }

        if (ogrNot < 50) {
            System.out.println("Kaldınız.");
        }

        // yukarıdaki 3 adet ifin yerine aşağıdaki aynı görevi daha hızlı sağlar çünkü tek şart
        // kontrol eder aşağıdaki yapı, yukarıdaki her iki if in şartınız da kontrol eder.
        if (ogrNot >= 50) {
            System.out.println("Geçtiniz.");
        }
        else {
            System.out.println("Kaldınız.");
        }

    }
}
