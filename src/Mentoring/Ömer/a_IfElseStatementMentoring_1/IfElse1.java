package Ömer.a_IfElseStatementMentoring_1;

import java.util.Scanner;

public class IfElse1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/*
                Koşulları gerçekleştirmek için oluşturduğumuz kod dizisidir.
                Else : İstediğimiz koşul dışındaki "tüm ihtimaller" else nin içerisindeki bloğu çalıştırır.
*/

        System.out.print("Yaşınızı giriniz:   ");

        int yas = sc.nextInt();


        if (yas>=18) {
            System.out.println("Sigara satın alabilirsiniz.");
        }else
            System.out.println("Yaşınız sigara satın almaya yetmiyor..");
    }
}
