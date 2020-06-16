package Burak.While_DoWhile.WhileLoops;

import java.util.Scanner;

public class b_while {

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("PIN kodunuzu giriniz: ");
     int userPin = sc.nextInt();

     int pinCode = 5555;
     while (userPin != pinCode){
         System.out.println("********** Yanlış PIN **********");
         System.out.println("Tekrar Deneyiniz");
         userPin = sc.nextInt();
     }
        System.out.println("Başarıyla giriş yapıldı.");
    }
}

//TODO INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.