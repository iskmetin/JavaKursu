package replit.ifElseStatementTurkce;

import java.util.Scanner;

public class ifStatement_6 {
    public static void main(String[] args) {
        /**

         Eğer int number 0 yazdırılırsa "Im neutral",
         Eğer int number 0'dan büyükse "I m positive",
         Eğer int number 0'dan küçükse "I am negative" yazdırılsın.
         */
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 0) {
            System.out.println("I am negative");
        }
        if (number == 0) {
            System.out.println("Im neutral");
        }
        if (number > 0) {
            System.out.println("I m positive");
        }


    }
}