package replit.arithmeticOperators;

import java.util.Scanner;

public class Arithmetic_operator_subtract_2 {
    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();
        int num2 = dp.nextInt();
        int num3 = dp.nextInt();
        int num4 = dp.nextInt();

        //int num1 = dp.nextInt();
        //    int num2 = dp.nextInt();
        //    int num3 = dp.nextInt();
        //    int num4 = dp.nextInt();
        int fark=num1-num2-num3-num4;
        System.out.println(fark);
    }
}
