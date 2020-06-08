package replit.arithmeticOperators;

import java.util.Scanner;

public class Arithmetic_operator_multiply_1 {
    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);

        double num1 = dp.nextDouble();
        double num2 = dp.nextDouble();
        double num3 = dp.nextDouble();
        //Verilen 3 double hakkında, (num1 , num2, num3),
        //
        //Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
        double sonuc = num1 * num2 * num3;
        System.out.println(sonuc);
    }
}
