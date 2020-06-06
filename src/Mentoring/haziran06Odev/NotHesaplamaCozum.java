package Mentoring.haziran06Odev;

import java.util.Scanner;

public class NotHesaplamaCozum {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Vize sınav sonucunuzu giriniz :");
        double vizeNotu = sc.nextDouble();
        System.out.println("Vize sınav yuzdesini giriniz :");
        double vizeYuzde = sc.nextDouble();
        System.out.println("Final sınav sonucunuzu giriniz :");
        double finalNotu = sc.nextDouble();
        System.out.println("Final sınav yuzdesini giriniz :");
        double finalYuzde = sc.nextDouble();
        double ort = (vizeNotu * vizeYuzde) / 100 + (finalNotu * finalYuzde) / 100;

        if (ort >= 90) {
            System.out.println("Notunuz " + ort + " Harf notunuz AA");
        } else if (ort >= 80) {
            System.out.println("Notunuz " + ort + " Harf notunuz BA");
        } else if (ort >= 70) {
            System.out.println("Notunuz " + ort + " Harf notunuz BB");
        } else if (ort >= 60) {
            System.out.println("Notunuz " + ort + " Harf notunuz CB");
        } else if (ort >= 50) {
            System.out.println("Notunuz " + ort + " Harf notunuz CC");
        } else if (ort >= 40) {
            System.out.println("Notunuz " + ort + " Harf notunuz DC");
        } else if (ort >= 30) {
            System.out.println("Notunuz " + ort + " Harf notunuz DD");
        } else {
            System.out.println("Notunuz " + ort + " Harf notunuz FF");
        }


    }
}
