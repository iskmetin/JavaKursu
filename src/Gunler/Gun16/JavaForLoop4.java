package Gunler.Gun16;
import java.util.Scanner;

public class JavaForLoop4 {
    public static void main(String[] args) {
        // Girilen bir sayının faktöryelini hesaplayınız.
        // 5! =>  5*4*3*2*1

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        int sayi=oku.nextInt();

        int faktoryel=1;
        for(int i=1; i<=sayi ; i++) {
            faktoryel = faktoryel * i; // faktoryel*=i;
        }

        System.out.println("faktoryel = " + faktoryel);
    }
}
