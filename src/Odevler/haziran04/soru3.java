package Odevler.haziran04;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        // 3- Girilen bir sayının yüzler basamağını ekrana yazdırınız.
        Scanner tara=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int a=tara.nextInt();
        System.out.println((a%1000)/100);
    }
}
