package Gunler.Gun11;

import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {
              // Ben buraya neden geldim ?
        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Vize notunuzu giriniz=");
        int vizeNotu = oku.nextInt();

        System.out.print("Final notunuzu giriniz=");
        int finalNotu = oku.nextInt();

        double ort = vizeNotu * 0.4 + finalNotu * 0.6;

        System.out.println("ort = " + ort);
        if (ort >= 60){
            System.out.println("Geçtiniz");
            System.out.println("Tebrikler");
        }
        else
        {
            System.out.println("Kaldınız");
        }
    }
}
