package Gunler.Gun14;


import java.util.Scanner;

public class WhileLoop4 {
    public static void main(String[] args) {
          // Girilen bir sayıya kadar olan sayıların toplamını bularak yazdırınız.
          // girilen sayı dahil
        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz =");
        int sayi=oku.nextInt();

        int sayac=1;
        int toplam=0;
        // 7 =>  1 2 3 4 5 6 7
        while (sayac <= sayi)
        {
            toplam = toplam + sayac; // toplam+=sayac;
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
