package Odevler.haziran02;

import java.util.Scanner;

public class odev3 {
    public static void main(String[] args) {
        // 3 kelimelik bir isimde ad ikinci ad ve soyad olarak ayırınız(Şöyle Ahmet Emin Yılmaz şeklinde girilen bir tam isimdeki bütün kelimeleri ayırınız)
        Scanner tara=new Scanner(System.in);
        System.out.println(" 3 isimli bir isim yazin");
        String s1=tara.nextLine();
        int bosluk1=s1.indexOf(" ");
        int bosluk2=s1.lastIndexOf(" ");
        String isim=s1.substring(0, bosluk1);
        String isimIki=s1.substring(bosluk1+1, bosluk2);
        String soyad=s1.substring(bosluk2, s1.length());
        System.out.println("isim :"+isim);
        System.out.println("Ikinci isim :"+isimIki);
        System.out.println("soyad :"+soyad);
    }
}
