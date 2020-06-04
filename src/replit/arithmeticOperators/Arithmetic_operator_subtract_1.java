package replit.arithmeticOperators;

import java.util.Scanner;

public class Arithmetic_operator_subtract_1 {
    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();
        int num2 = dp.nextInt();

        //Verilen 4 tane int vardır.
        //Int'lerin toplamlarını yazdırın.
        int fark=num1-num2;
        System.out.println(fark);
    }
}
