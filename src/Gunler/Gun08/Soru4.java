package Gunler.Gun08;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağını bir stringde boşulk karakterinin olup olmadığını kontrol ediniz.
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir string giriniz = ");
        String text = oku.nextLine();

        boolean boslukVarMi = text.contains(" ");
        System.out.println("boslukVarMi = " + boslukVarMi);

        // Kullanıcıdan alacağını bir stringin boş olup olmadığını kontrol ediniz.
        boolean bosMu = text.isEmpty();
        System.out.println("bosMu = " + bosMu);
    }
}
