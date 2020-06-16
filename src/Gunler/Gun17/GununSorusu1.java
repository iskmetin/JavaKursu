package Gunler.Gun17;

import java.util.Scanner;

public class GununSorusu1 {
    public static void main(String[] args) {
        // bilgisayar 0-10 arası sayı tutsun(Random). Kullanıcıdan en fazla 3 hak
        // vererek sayıyı bulmasını isteyiniz.Bulduğunda tebrikler yazsın.

        Scanner oku=new Scanner(System.in);

        int tutulanSayi= (int)(Math.random()*10) +1; // Math.Random()-> 0 - 0,99999  *10 => 0-9  + 1 => 1-10
        int sayac=1;

        while(sayac<=3){   // for(int sayac=0;sayac<=3;sayac++)

            System.out.print("Sayıyı tahmin edin=");
            int tahmin = oku.nextInt();

            if (tutulanSayi == tahmin){
                System.out.println("tebrikler");
                break;
            }
            else
                System.out.print("Tekrar ");

            sayac++;
        }

        if (sayac == 4)
            System.out.println("Hakkınız bitti, bulamadınız.Tutulan sayı="+tutulanSayi);
    }

}
