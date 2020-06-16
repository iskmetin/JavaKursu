package Burak.ArithmeticsOperators;

import java.util.Scanner;

public class e_multiply1 {

    //TODO      3 adet int oluşturunuz. Bu üç int'i birbirleriyle çaprpınız. Sonucu yazdırınız.
    //TODO      Scanner kullanınız.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println(num1 * (num2 * num3));

    }
}
