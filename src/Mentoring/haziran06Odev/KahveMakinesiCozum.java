package Mentoring.haziran06Odev;

import java.util.Scanner;

public class KahveMakinesiCozum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hangi Kahveyi istersiniz?\n" +
                "  1.Turk kahvesi\n" +
                "  2.Filtre Kahve\n" +
                "  3.Espresso");
        String hangiKahve = sc.nextLine();
        if (hangiKahve.toUpperCase().contains("Turk".toUpperCase())) {
            System.out.println("Turk kahvesi hazirlaniyor.");
        } else if (hangiKahve.toLowerCase().contains("Filtre".toLowerCase())) {
            System.out.println("Filtre kahve hazirlaniyor.");
        } else if (hangiKahve.toLowerCase().contains("Espresso".toLowerCase())) {
            System.out.println("Espresso hazirlaniyor...");
        } else {
            System.out.println("Hatali tuslama yaptiniz.Programi bastan baslatin");
            System.exit(0);
        }

        System.out.println("Sut eklememizi ister misiniz ?\n" +
                "  1.Evet\n" +
                "  2.Hayir\n");
        String sut = sc.nextLine();
        if (sut.toUpperCase().contains("Evet".toUpperCase())) {
            System.out.println("Sut ekleniyor...");
        } else if (sut.toLowerCase().contains("hayir".toLowerCase())) {
            System.out.println("Sut eklenmiyor");
        } else {
            System.out.println("Hatali tuslama yaptiniz.Programi bastan baslatin");
            System.exit(0);
        }
        System.out.println("seker ister misiniz ? ?\n" +
                "  1.Evet\n" +
                "  2.Hayir\n");
        String seker = sc.nextLine();
        if (seker.toUpperCase().contains("Evet".toUpperCase())) {
            System.out.println("Kac seker olsun?");
            int kacSeker = sc.nextInt();
            System.out.println(kacSeker + " seker ekleniyor.");
        } else if (seker.toUpperCase().contains("Hayir".toUpperCase())) {
            System.out.println("seker eklenmiyor");

        } else {
            System.out.println("Hatali tuslama yaptiniz.Programi bastan baslatin");
            System.exit(0);
        }
        System.out.println("Hangi boyutta olsun?: \n" +
                "  1.Buyuk\n" +
                "  2.Orta\n" +
                "  3.kucuk\n");
        sc.nextLine();
        String boyut = sc.nextLine();

        if (boyut.toUpperCase().contains("Buyuk".toUpperCase())) {
            System.out.println("Kahveniz " + boyut + " boy hazirlaniyor.");

        } else if (boyut.toUpperCase().contains("Orta".toUpperCase())) {
            System.out.println("Kahveniz " + boyut + " boy hazirlaniyor.");

        } else if (boyut.toUpperCase().contains("kucuk".toUpperCase())) {
            System.out.println("Kahveniz " + boyut + " boy hazirlaniyor.");

        } else {
            System.out.println("Hatali tuslama yaptiniz.Programi bastan baslatin");
            System.exit(0);
        }
        System.out.println(hangiKahve + " " + boyut + " boy kahveniz hazirdir. Afiyet olsun !!! ");


    }
}
