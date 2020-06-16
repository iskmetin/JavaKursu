package Tahir.mentoring1;


import java.util.Scanner;

public class Recap1 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        // Benim adim Tahir soyadim Ata.Yasim 37, boyum 1,75 ve cinsiyetim erkek.

        String name,surname,gender;
        int age;
        double height;

        System.out.print("Adinizi girin : ");
        name=scan.nextLine();

        System.out.print("Soyadinizi girin : ");
        surname=scan.nextLine();

        System.out.print("Yasiniz : ");
        age=scan.nextInt();
        scan.nextLine();
        System.out.print("Boy olcunuzu girin : ");

        height=scan.nextDouble();
        scan.nextLine();

        System.out.print("Cinsiyetiniz nedir: ");
        gender=scan.nextLine();

        System.out.println("Benim adim "+name+" soyadim "+surname+"."+"Yasim "+age+","+" boyum "+height+" ve cinsiyetim "+gender+".");





    }
}
