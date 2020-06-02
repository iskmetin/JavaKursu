package Gunler.Gun06;

import java.util.Scanner;

public class Ornek7 {
    public static void main(String[] args) {
        // Kullanıcıdan username(string), password(int) ve gizli soruyu(cümle) alıp ekrana yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("username= ");
        String username = oku.nextLine();

        Scanner oku2 = new Scanner(System.in);
        System.out.print("password= ");
        int password = oku2.nextInt();

        System.out.print("Gizli Soru = ");
        String gizliSoru = oku.next(); // nextLine : satır okuma, next ise kelime okuma yapar

        System.out.println(username + "\n" + password + "\n" + gizliSoru);
    }
}
