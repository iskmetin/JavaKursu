package Burak.ArithmeticsOperators;

import java.util.Scanner;

public class b_Sum2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();                //Double'da virgül(,)(örn: 1,23) kullanılmalıdır.
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        System.out.println(num1 + num2 + num3);
    }
}

//TODO       3 adet double oluşturunuz. Bu 3 double'ı toplayınız. Sonucu yazdırınız.
//TODO       Scanner kullanınız.