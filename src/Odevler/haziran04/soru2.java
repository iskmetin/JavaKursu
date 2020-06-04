package Odevler.haziran04;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        //  2- Girilen bir sayının onlar basamağını ekrana yazdırınız.
        Scanner tara=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int a=tara.nextInt();
        System.out.println((a%100)/10);
    }
}
