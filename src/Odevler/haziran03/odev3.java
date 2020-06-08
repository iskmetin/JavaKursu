package Odevler.haziran03;

import java.util.Scanner;

public class odev3 {
    public static void main(String[] args) {
        //Girilen bir stringdeki bütün boşluk karakterlerini _ ile değiştiriniz.
        Scanner tara = new Scanner(System.in);
        System.out.println("2 veya 3 kelimeli ad ve soyad giriniz");
        String s1 = tara.nextLine();

        System.out.println(s1.replaceAll(" ", "_"));

    }
}
