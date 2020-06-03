package Odevler.haziran03;

import java.util.Scanner;

public class odev4 {
    public static void main(String[] args) {
        //Kullanıcdan alacağını şifreniz sizin sabit belirlediğiniz şifre ile aynı olup olmadığını ,
        // büyük küçük harf ayırımı olmadan kontrol ederek sonucu yazdırınız
        Scanner tara=new Scanner(System.in);
        String sifre="meto";
        System.out.println("sifre giriniz");
        String s1=tara.nextLine();

        System.out.println(sifre.equalsIgnoreCase(s1));

    }
}
