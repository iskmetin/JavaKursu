package Mentoring.haziran06Odev;

import java.util.Scanner;

public class KahveMakinesiCozum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hangi Kahveyi İstersiniz?\n" +
                "  1.Türk kahvesi\n" +
                "  2.Filtre Kahve\n" +
                "  3.Espresso");
        String hangiKahve = sc.nextLine();
        if (hangiKahve.toUpperCase().contains("Türk kahvesi".toUpperCase())) {
            System.out.println("Türk kahvesi hazırlanıyor.");
        } else if (hangiKahve.toLowerCase().contains("Filtre Kahve".toLowerCase())) {
            System.out.println("Filtre kahve hazırlanıyor.");
        } else if (hangiKahve.toLowerCase().contains("Espresso".toLowerCase())) {
            System.out.println("Espresso hazırlanıyor...");
        } else {
            System.out.println("Hatalı tuşlama yaptınız.Programi bastan baslatin");
            System.exit(0);
        }

        System.out.println("Süt eklememizi ister misiniz ?\n" +
                "  1.Evet\n" +
                "  2.Hayır\n");
        String sut = sc.nextLine();
        if (sut.toUpperCase().contains("Evet".toUpperCase())) {
            System.out.println("Süt ekleniyor...");
        } else if (hangiKahve.toUpperCase().contains("Hayır".toUpperCase())) {
            System.out.println("Süt eklenmiyor");
        } else {
            System.out.println("Hatalı tuşlama yaptınız.Programi bastan baslatin");
            System.exit(0);
        }System.out.println("Şeker ister misiniz ? ?\n" +
                "  1.Evet\n" +
                "  2.Hayır\n");
        String seker = sc.nextLine();
        if (seker.toUpperCase().contains("Evet".toUpperCase())) {
            System.out.println("Kaç şeker olsun?");
            int kacSeker = sc.nextInt();
            System.out.println(kacSeker+" şeker ekleniyor.");
        } else if (seker.toUpperCase().contains("Hayır".toUpperCase())) {
            System.out.println("Şeker eklenmiyor");

        } else {
            System.out.println("Hatalı tuşlama yaptınız.Programi bastan baslatin");
            System.exit(0);
        }

    }
}
