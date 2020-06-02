package Gunler.Gun06;

import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde adres bilgisi alarak yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Cadde :");
        String cadde = oku.nextLine();

        System.out.print("Sokak :");
        String sokak = oku.nextLine();

        Scanner oku2 = new Scanner(System.in);
        System.out.print("Pota Kodu :");
        int pk = oku2.nextInt();

        System.out.print("Ülke :");
        String ulke = oku.nextLine();

        System.out.println(cadde + " " + sokak + " " + " " + pk + " " + ulke);
        // Okuma işleminde klavyeden sadeec girilen bilgi değil enter ve diğer gözürnmeyen
        // karakterler de gittiğinden sonraki gelen okuma isteği görünmez karakterle
        // dolabiliyor.Bu sebeple veri girilmiş gibi kabul ediyor.Bunu çözmenin yolu
        // ya araya ek bir gereksin okuma komutu eklemek veya tip değiştiğinde yeni bir scanner
        // değişkeni tanımlamaktır.

    }
}
