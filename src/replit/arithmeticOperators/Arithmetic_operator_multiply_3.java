package replit.arithmeticOperators;

import java.util.Scanner;

public class Arithmetic_operator_multiply_3 {
    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();
        int num2 = dp.nextInt();
        int num3 = dp.nextInt();
        int num4 = dp.nextInt();
        //Oluşturulmuş olan double'lar hakkında,
        //Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        //int sonucu yazdırın.
        int sonuc=num1*num2*num3*num4;
        System.out.println(sonuc);
    }
}
