package Odevler.haziran04;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        // 4- Girilen 3 basamaklı bir sayınızn basamaklarının toplamını ekrana yazdırınız.
        Scanner tara=new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int a=tara.nextInt();
        System.out.println((a/100)+(a%100)/10+(a%10));
    }
}
