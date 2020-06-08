package Gunler.Gun11;
import java.util.Scanner;

public class ifElseLogic6 {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku = new Scanner(System.in);
        System.out.print("Yeni şifrenizi giriniz=");
        String yeniSifre= oku.nextLine();

        if (yeniSifre.length() >= 8 && !yeniSifre.contains("pass") && yeniSifre.length() <=12)
            System.out.println("Tamam");
        else
            System.out.println("Uygun olmayan şifre");
    }
}
