package Gunler.Gun11;

import java.util.Scanner;

public class ifElseLogic7 {
    public static void main(String[] args) {
        // Bir otpark ücret hesapalama programı yapılma isteniyor.
        // 0-2 saat ara 5 €, 2-5 arası 10 € , 5 saatten sonra 15 € olarak
        // saat girildiğinde ücreti yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Saati giriniz=");
        int saat = oku.nextInt();

        if (saat <= 2) {
            System.out.println("5 €");
        } else if (saat <= 5) {
            System.out.println("10 €");
        } else {
            System.out.println("15 €");
        }
    }
}
