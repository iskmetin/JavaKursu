package Odevler.haziran03;

import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {
        //Girilen 2 veya 3 kelimeli ad ve soyadların ilk harflerinin
        //hepsini küçük ve daha sonra büyük hallerini yazdırınız.
        Scanner tara=new Scanner(System.in);
        System.out.println("2 veya 3 kelimeli ad ve soyad giriniz");
        String s1=tara.nextLine();
        System.out.println(s1.toUpperCase());
    }
}
