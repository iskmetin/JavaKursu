package Odevler.haziran02;

import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
        // 2 kelimelik bir isimde ad ve soyadı ayırın

        Scanner tara=new Scanner(System.in);
        System.out.println(" 2 isimli bir isim yazin");
        String s1=tara.nextLine();
        int bosluk=s1.indexOf(" ");
        String isim=s1.substring(0, bosluk);
        String soyad=s1.substring(bosluk+1, s1.length());
        System.out.println("isim :"+isim);
        System.out.println("soyad :"+soyad);
    }
}
