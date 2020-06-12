package Gunler.Gun14;

import java.util.Scanner;

public class WhileLoop6 {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
        // girilen sayı dahil
        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz =");
        int sayi=oku.nextInt();

        while(sayi>0)
        {
            if (sayi%2==1) {
                System.out.println("sayi = " + sayi);
            }

            sayi--; // sayi=sayi-1;
        }
    }
}
