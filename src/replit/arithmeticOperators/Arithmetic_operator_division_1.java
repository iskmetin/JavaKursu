package replit.arithmeticOperators;

import java.util.Scanner;

public class Arithmetic_operator_division_1 {
    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();
        int num2 = dp.nextInt();
        //Verilen iki int hakkında (num1,  num2),
        //İlk int'i ikinci int'e bölün.
        //Sonucu yazdırın.
        int div=num1+num2;
        System.out.println(div);
    }
}
