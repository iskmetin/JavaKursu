package Tahir.mentoring1;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {


        // rakamla bir sayi yazdir int olsun
        // String olan bir sayi yazdir
        // sonra yazdirdigin sayilarin toplam degerini int olarak bul

        int a=10;
        String b="10";
        System.out.println(a);
        System.out.println(b);





        Scanner scan=new Scanner(System.in);
        System.out.print("Rakamla bir sayi giriniz: ");
        int num1=scan.nextInt();
        scan.nextLine();
        System.out.print("String olan bir sayi giriniz: ");
        String num2=scan.nextLine();

      //  System.out.println(num1+num2);



        String toplam=num1+num2;
        System.out.println("String toplam  " +toplam);

        System.out.println("Int toplam  "+(num1+Integer.parseInt(num2)));
//        int num3=Integer.parseInt(num2);
//
//        System.out.println(num1+num3);





    }
}
