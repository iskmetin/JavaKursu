package Odevler.haziran02;

import java.util.Scanner;

public class odev1 {

    // 3 isimlik bir ismi kısaca yazdırın z.m.d

    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println(" 3 isimli bir isim yazin");
        String s1 = tara.nextLine();

        int bosluk1 = s1.indexOf(" ");
        int bosluk2 = s1.lastIndexOf(" ");
        char ilkHarf = s1.charAt(0);
        char ikinciHarf = s1.charAt(bosluk1 + 1);
        char ucuncuHarf = s1.charAt(bosluk2 + 1);
        System.out.println(ilkHarf + "." + ikinciHarf + "." + ucuncuHarf);


    }
}
