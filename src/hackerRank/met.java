package hackerRank;

import java.util.Scanner;

public class met {

    public static void main(String[] args) {
        //  1- Girilen bir sayının birler basamağını ekrana yazdırınız.
        //  2- Girilen bir sayının onlar basamağını ekrana yazdırınız.
        // 3- Girilen bir sayının yüzler basamağını ekrana yazdırınız.
        // 4- Girilen 3 basamaklı bir sayınızn basamaklarının toplamını ekrana yazdırınız.
        // -> 435 -> 4,3,5  => 4+3+5 => 12
        // 5- Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak
        // ekrana yazdırınız.Örneğin 435 -> 534 sayı olarak bulunacak.

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz = ");
        int sayi = scan.nextInt();

        System.out.println("birler basamağı = " + sayi % 10);
        System.out.println("onlar basamağı = " + (sayi % 100) / 10);
        System.out.println("yüzler basamağı = " + (sayi % 1000) / 100);

        System.out.println("girilen 3 basamaklı sayının rakamları toplamı = " + (sayi % 10 + (sayi % 100 - sayi % 10) / 10 + (sayi % 1000 - sayi % 100) / 100));

        System.out.println("girilen 3 basamaklı sayının basamaklarına göre tersi = " + sayi % 10 + (sayi % 100 - sayi % 10) / 10 + (sayi % 1000 - sayi % 100) / 100);

    }

}
