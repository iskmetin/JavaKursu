package Odevler.haziran04;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        // 5- Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak ekrana yazdırınız.
        Scanner tara = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int a = tara.nextInt();
        String yuzler = Integer.toString(a / 100);
        String onlar = Integer.toString((a % 100) / 10);
        String birler = Integer.toString(a % 10);
        System.out.println(birler + onlar + yuzler);
    }
}
