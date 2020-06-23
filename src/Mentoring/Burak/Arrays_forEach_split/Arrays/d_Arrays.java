package Burak.Arrays_forEach_split.Arrays;

import java.util.Scanner;

public class d_Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //TODO    Scanner ile Array elemanlarını girme

        int[] Elma = new int[5];
        int toplam = 0;

        //Arrayin değerlerini girme
        System.out.println("Array elemanlarını giriniz: ");
        for (int i = 0; i < Elma.length; i++){
            Elma[i] = sc.nextInt();
        }

        //Arrayin değerlerini yazdırma
        System.out.println("Array'in değerleri yazdırılıyor: ");
        for (int i = 0; i < Elma.length; i++){
            System.out.println("Eleman: " + Elma[i]);
        }

        //Arrayin değerlerinin ortalmasını alma
        for (int i = 0; i < Elma.length; i++){
            toplam = toplam + Elma[i];

        }
        int ortalama = toplam / Elma.length;
        System.out.println("Arrayin elemanlarının Ortalaması: " + ortalama);






    }
}
