package Gunler.Gun11;

import java.util.Scanner;

public class ifElseif4 {
    public static void main(String[] args) {
        // girilen bir sayının pozitif mi negatif mi olduğunu yazdırınız.
        // 3 ihtimal var p,n,sıfır
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int sayi = oku.nextInt();

        if (sayi > 0)
            System.out.println("pozitif");
        else // 2 ihtimal daha var negatif veya sıfır olabilir
            if (sayi < 0)
                System.out.println("negatif");
            else
                System.out.println("sıfır");
    }
}
