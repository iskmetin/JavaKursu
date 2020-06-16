package Ömer.a_Switch_Case_Mentoring_2;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı giriniz :  ");

        int sayi = sc.nextInt();


        switch (sayi){
            case 1:
                System.out.println("Bir");
            break;
            case 2:
                System.out.println("İki");
                     //bloklar arası geçişi durduruyoruz. Bir nevi else if gibi düşünün.
                 break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("dört");
            default:            //ELSE MANTIGI
                System.out.println("Geçersiz sayı");
        }
    }
}
