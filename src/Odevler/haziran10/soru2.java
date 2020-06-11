package Odevler.haziran10;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("uc basamakli bir sayi gir");
        int sayi = oku.nextInt();
        int yuzler, onlar, birler;
        if ((sayi < 1000) && (sayi >= 100)) {
            switch ((sayi / 100) % 10) {
                case 1:
                    System.out.print("yuz ");
                    break;
                case 2:
                    System.out.print("iki yuz ");
                    break;
                case 3:
                    System.out.print("uc yuz ");
                    break;
                case 4:
                    System.out.print("dort yuz ");
                    break;
                case 5:
                    System.out.print("bes yuz ");
                    break;
                case 6:
                    System.out.print("alti yuz ");
                    break;
                case 7:
                    System.out.print("yedi yuz ");
                    break;
                case 8:
                    System.out.print("sekiz yuz ");
                    break;
                case 9:
                    System.out.print("dokuz yuz ");
                    break;
            }
            switch ((sayi / 10) % 10) {
                case 1:
                    System.out.print("on ");
                    break;
                case 2:
                    System.out.print("yirmi ");
                    break;
                case 3:
                    System.out.print("otuz ");
                    break;
                case 4:
                    System.out.print("kirk ");
                    break;
                case 5:
                    System.out.print("elli ");
                    break;
                case 6:
                    System.out.print("altmis ");
                    break;
                case 7:
                    System.out.print("yetmis ");
                    break;
                case 8:
                    System.out.print("seksen ");
                    break;
                case 9:
                    System.out.print("doksan ");
                    break;
            }
            switch (sayi % 10) {
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("uc");
                    break;
                case 4:
                    System.out.print("dort");
                    break;
                case 5:
                    System.out.print("bes");
                    break;
                case 6:
                    System.out.print("alti");
                    break;
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                    break;
            }
        } else {
            System.out.println("3 basamakli degil");
        }
    }
}
