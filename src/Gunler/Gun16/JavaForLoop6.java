package Gunler.Gun16;

import java.util.Scanner;

public class JavaForLoop6 {
    public static void main(String[] args) {
        // Girilen bir stringdeki a harfi sayısını bulunuz.
        // c harfine sıra gelirse döngüden çıkılsın

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String cumle=oku.nextLine();

        int aMiktar=0;
        for(int i=0; i< cumle.length(); i++)
        {
           if (cumle.charAt(i) == 'a')
               aMiktar++;
           else
               if (cumle.charAt(i) == 'c')
                   break;

            System.out.println("dongü içindeki işleme giren harfler = " + cumle.charAt(i));
        }

        System.out.println("aMiktar = " + aMiktar);
    }
}
