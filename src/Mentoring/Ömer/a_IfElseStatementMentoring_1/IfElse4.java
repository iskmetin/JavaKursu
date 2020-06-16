package Ömer.a_IfElseStatementMentoring_1;

import java.util.Scanner;

public class IfElse4 {
    public static void main(String[] args) {

/*

Sistem size            "Bir String giriniz."   cümlesini versin.

hepsi if in içinde olacak !

Eğer Stringde    a karakteri varsa,   a karakterinden sonraki kısım ile yeni bir string kaydedilsin ve tüm harfleri büyük olsun. (a karakteri dahil)
Daha sonra     ilk stringi yazdırınız, altına da a karakterinden sonraki kısma sahip olan Stringi yazdırınız


Eğer a karakteri yoksa "Girdiğiniz Stringde a karakteri yoktur..     mesajını versin.

örn:    String giriniz:
    If else çok kolay gibi

 Yeni String= AY GİBİ
 Eski String = çok kolay gibi

 */

        Scanner sc = new Scanner(System.in);

        System.out.print("String gir:  ");
        String s = sc.nextLine();

        if (s.contains("a")){
            String yeni = s.substring(s.indexOf("a")).toUpperCase();
            System.out.println("Yeni String:  " + yeni);
            System.out.println("Eski String:  " + s);

        }else
            System.out.println("Girdiğiniz String'de a karakteri yoktur.");



    }
}
