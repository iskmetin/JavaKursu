package Odevler.haziran11;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        //2- bilgisayar 0-10 arası sayı tutsun(Random). Kullanıcıdan en fazla 3 hak vererek sayıyı bulmasını isteyiniz.Bulduğunda tebrikler yazsın.
        Scanner oku = new Scanner(System.in);
        int sayi = (int) (Math.random() * 11);
        int tahmin;
        int count = 0;
        do {
            count++;
            System.out.println("0 ile 10 arasinda bir tahminde bulunun");
            tahmin = oku.nextInt();
            if (tahmin < 0 || tahmin > 10) {
                System.out.println("gecersiz sayi girdiniz.0 ile 10 arasinda bir tamsayi giriniz");
                count = count - 1;
                continue;
            } else if (tahmin == sayi) {
                System.out.println("tebrikler");
                break;
            } else {
                System.out.println("bilemediniz " + (3 - count) + " hakkiniz kaldi");
            }
            if (count == 3) {
                System.out.println("uzgunuz hakkiniz kalmadi.sayi " + sayi + " idi.");
            }

        } while (count < 3);

    }
}
