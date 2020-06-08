package Odevler.haziran04;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        //  1- Girilen bir sayının birler basamağını ekrana yazdırınız.
        Scanner tara = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int a = tara.nextInt();
        System.out.println(a % 10);
    }
}
