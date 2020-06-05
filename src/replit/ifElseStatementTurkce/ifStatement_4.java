package replit.ifElseStatementTurkce;

import java.util.Scanner;

public class ifStatement_4 {
    public static void main(String[] args) {
        /**
         double1 ve double2 isimli iki tane double oluşturulmuştur.
         Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
         Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız.
         */
        Scanner scan = new Scanner(System.in);
        double number  = scan.nextDouble();
        double number2  = scan.nextDouble();
        if (number > number2) {
            System.out.println("double 1 is greater than double 2");

        } else
            System.out.println("double 1 is smaller than double 2");
    }
}
