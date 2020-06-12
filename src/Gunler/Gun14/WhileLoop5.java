package Gunler.Gun14;

import java.util.Scanner;

public class WhileLoop5 {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayıların toplamını bularak yazdırınız.
        // girilen sayı dahil, ayrı bir sayac değişkeni kullanmayınız
        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz =");
        int sayi=oku.nextInt();

        int toplam=0;
         // 1 2 3 4 5 6 7    7 için  önceki soruda
        // 7 6 5 4 3 2 1
        while(sayi > 0)
        {
            toplam=toplam + sayi;
            sayi--;
        }
        System.out.println("toplam = " + toplam);
    }
}
