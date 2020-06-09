package Gunler.Gun12;

import java.util.Scanner;

public class JavaRandom8 {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi =");
        int kacaKadarRandomSayi = oku.nextInt();

        int uretilenSayi = (int) (Math.random() * (kacaKadarRandomSayi + 1));

        System.out.print("Sayı tahmininiz = ");
        int tahmin = oku.nextInt();

        if (uretilenSayi == tahmin)
            System.out.println("Tebrikler");
        else
            System.out.println("Bilemedinki bilemedinki");

        System.out.println("uretilenSayi = " + uretilenSayi);
    }

}
