package replit.methods;

import java.util.Scanner;

public class method10 {
    public static void main(String[] args) {
//        ismi fib olan bir method oluşturun.
//
//        Bu methos bir int değer kabul etsin.
//          Return int olmalı.
//          Örnek 1:Yaygın olarak F (n) olarak gösterilen Fibonacci sayıları, Fibonacci sekansı adı verilen bir sekans oluşturur,
//        böylece her sayı, 0 ve 1'den başlayarak önceki iki numaranın toplamıdır.

        Scanner oku = new Scanner(System.in);

        System.out.println("Bir sayi gir");
        int t = oku.nextInt();
        System.out.println( fib(t));
    }

    public static int fib(int t) {
        int[] fibDizi = new int[t+1];

        if(t<1){
            fibDizi[0]=0;
        }
        else if (t<2) {
            fibDizi[0]=0;
            fibDizi[1]=1;
        }
        else{
            for (int i = 2; i < t+1; ++i)//loop starts from 2 because 0 and 1 are already printed
            {
                fibDizi[0]=0;
                fibDizi[1]=1;
                fibDizi[i]=fibDizi[i-1]+fibDizi[i-2];

            }

        }
        return fibDizi[t];
    }
}