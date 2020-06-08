package replit.arithmeticOperators;

import java.util.Scanner;

public class Arithmetic_operator_multiply_2 {
    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);

        double num1 = dp.nextDouble();
        double num2 = dp.nextDouble();
        double num3 = dp.nextDouble();
        double num4 = dp.nextDouble();
        //Oluşturulmuş olan double'lar hakkında,
        //Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        //Double sonucu yazdırın.
        double sonuc = num1 * num2 * num3 * num4;
        System.out.println(sonuc);
    }
}
