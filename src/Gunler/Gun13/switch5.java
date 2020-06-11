package Gunler.Gun13;

import java.util.Scanner;

public class switch5 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi =");
        int sayi= oku.nextInt();

        //  176  onlar basamağı nasıl bulunuz ?
        // önce 10 bölüerim int bölme olduğundan elimde 17 kalır ben 7 ye ulaşmak istiyorum
        // sonra çıkan sonucu %10 yaptığımda 10 bölümden kalanı yani son rakamı verir 7 yi
        int onlarBasamagi = (sayi/10)%10;
        onlarBasamagi = Math.abs(onlarBasamagi);
        switch (onlarBasamagi) {
            case 0: System.out.println("sıfır");break;
            case 1: System.out.println("bir");break;
            case 2: System.out.println("iki");break;
            case 3: System.out.println("üç");break;
            case 4: System.out.println("dört");break;
            case 5: System.out.println("beş");break;
            case 6: System.out.println("altı");break;
            case 7: System.out.println("yedi");break;
            case 8: System.out.println("sekiz");break;
            case 9: System.out.println("dokuz");break;
        }




    }
}
