package Gunler.Gun10;

import java.util.Scanner;

public class GunuSorusu1 {
    public static void main(String[] args) {
        // 5- Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak
        // ekrana yazdırınız.Örneğin 435 -> 534 sayı olarak bulunacak.

        Scanner oku = new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz = ");
        int sayi = oku.nextInt();

//        435 -> 534
//                4 x1 ,  3x10,  5x100
        int birler = sayi % 10; // ilk basamağını verir 5
        int onlar = (sayi / 10) % 10; //(sayi / 10 ) -> 43  ,  %10 -> 3
        int yuzler = sayi / 100; // yüzler basamağını verir 4

        System.out.println("birler = " + birler);
        System.out.println("onlar = " + onlar);
        System.out.println("yuzler = " + yuzler);

        int tersi = birler * 100 + onlar * 10 + yuzler;
        System.out.println("tersi = " + tersi);
    }
}
