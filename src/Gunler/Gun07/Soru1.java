package Gunler.Gun07;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        //  Kullanıcıdan alacağınız bir kelimenin son harfini yazdırınız.
        System.out.print("Bir kelime giriniz= ");
        Scanner oku = new Scanner(System.in);
        String okunanKelime = oku.nextLine();

        // uzunluk adedi veriyordu, son index i ise  length-1 verecektir.
        int uzunluk = okunanKelime.length();
        char sonKarakter = okunanKelime.charAt(uzunluk - 1);

        System.out.println("sonKarakter = " + sonKarakter);
        System.out.println("sonKarakter = " + okunanKelime.charAt(okunanKelime.length() - 1));
    }
}
