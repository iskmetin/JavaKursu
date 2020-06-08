package replit.arithmeticOperators;

import java.util.Scanner;

public class Arithmetic_operator_reminder_1 {
    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();
        int num2 = dp.nextInt();
        //Verilen int ler hakkında (num1, num2),
        //num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
        //int sonucu yazdırın.
        int sonuc = num1 % num2;
        System.out.println(sonuc);
    }
}
