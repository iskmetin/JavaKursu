package Odevler.haziran03;

import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {
        //Girilen 2 veya 3 kelimeli ad ve soyadların ilk harflerinin
        //hepsini küçük ve daha sonra büyük hallerini yazdırınız.
        Scanner tara = new Scanner(System.in);
        System.out.println("3 kelimeli ad ve soyad giriniz");
        String s1 = tara.nextLine();
        String ucuncuHarf = "";

        String ilkHarf = s1.substring(0, 1);
        String ikinciHarf = s1.substring(s1.indexOf(" ") + 1, s1.indexOf(" ") + 2);
        s1 = s1.replaceFirst(" ", "_");
        ucuncuHarf = s1.substring(s1.indexOf(" ") + 1, s1.indexOf(" ") + 2);
        System.out.println((ilkHarf + "." + ikinciHarf + "." + ucuncuHarf).toLowerCase());
        System.out.println((ilkHarf + "." + ikinciHarf + "." + ucuncuHarf).toUpperCase());
    }
}
