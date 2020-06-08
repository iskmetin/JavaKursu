package Odevler.haziran03;

import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
        //Girilen bir string içinde bir kelime arayınız, büyük harf veya küçük harf de olsa aranan kelimede bulsun
        Scanner tara = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String s1 = tara.nextLine();
        System.out.println("Aranacak kelime giriniz");
        String ara = tara.nextLine();
        System.out.println(s1.toLowerCase().contains(ara.toLowerCase()));

    }
}
