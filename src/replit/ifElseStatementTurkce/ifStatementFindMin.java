package replit.ifElseStatementTurkce;

import java.util.Scanner;

public class ifStatementFindMin {
    public static void main(String[] args) {
        /**
         * Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
         * Bu numarayı yazdırınız.
         * Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.
         *Örn: 10-11-12 > 10
         */
        Scanner scan = new Scanner(System.in);
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();
        int min = i1;
        if (i1 > i2) {
            min = i2;
        }
        if (i1 > i3) {
            min = i3;
        }
        System.out.println(min);


    }
}
