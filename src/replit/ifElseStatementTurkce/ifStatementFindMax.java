package replit.ifElseStatementTurkce;

import java.util.Scanner;

public class ifStatementFindMax {
    public static void main(String[] args) {
        /**
         * Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         * Bu en yüksek numarayı yazdırın.
         * Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         * Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır
         */
        Scanner scan = new Scanner(System.in);
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();
        int max = i1;
        if (i1 < i2) {
            max = i2;
        }
        if (i1 < i3) {
            max = i3;
        }
        System.out.println(max);


    }
}
