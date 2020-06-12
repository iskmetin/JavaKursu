package Odevler.haziran11;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        //3-Girilen 5 sayının toplamını ekrana yazdırınız.
        Scanner oku = new Scanner(System.in);
        int toplam = 0;
        int count = 0;
        int sayi;
        while (count < 5) {
            System.out.println("bir sayi giriniz.(" + (5 - count) + " sayi kaldi.)");
            sayi = oku.nextInt();
            toplam += sayi;
            count++;
        }
        System.out.println("toplam: " + toplam);

    }
}
