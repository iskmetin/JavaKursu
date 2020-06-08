package replit.arithmeticOperators;

import java.util.Scanner;

public class Arithmetic_operator_sum3 {
    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();
        int num2 = dp.nextInt();
        int num3 = dp.nextInt();

        //Verilen 3 tane int (num1,num2,num3),
        //Bu üç int'in toplamı yazdırın.
        int sum = num1 + num2 + num3;
        System.out.println(sum);
    }
}
