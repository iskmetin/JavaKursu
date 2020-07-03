package Tahir.ifElseWhile;

import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        // Sadece 1 e ve kendine bolunebilen sayilara asal sayi denir(Prime number)
        // sayi asalmi degilmi?
        // girdigimiz sayiya kadar butun asal sayilari yazdiralim
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();
        int counter = 2;
        boolean isPrime = true;//   isPrime true kabul ettik. isPrime bir check degiskenidir

        while (counter < number) {

            /*
            counter dongude 2 den baslayarak sayimiza kadar sayilari verecek
             */
            if (number % counter == 0) {
                isPrime = false;
                break;      // bu if blogu asal olmayan sayilari bulup isPrime false yapiyor
            }

            counter++;

        }


        if (isPrime == true) {
            System.out.println("Asal");
        } else {
            System.out.println("Asal degil");
        }

    }
}
