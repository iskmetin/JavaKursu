package projeler.haziran26;

import java.util.Scanner;

public class AdditionSquareOfNumbers {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.println("bir sayi gir");
        int sayi1 = oku.nextInt();
        System.out.println("ikinci bir sayi gir");
        int sayi2 = oku.nextInt();
        System.out.println(substSquare(sayi1, sayi2));

    }

    /*
    Create one method name is getSumOfSquares
    This method get one int as parameter
    Return type is int

    Find the sum of the numbers from 1 to your number
    Then find the square of the sum

    for example:

    int is 10
     (1+2+...+10)²=55²=3025
     return 3025

     */


    /*

    Given one method name is substSquare

    This method get two ints as parameter

    return type is int

    By Using  getSumOfSquares method
    First find the sum of the numbers from 1 to your parameter 1
    Then find the square of the sum

    Second  find the sum of the numbers from 1 to your parameter 2
    Then find the square of the sum

    Last add the sum s each other

    for example:
    int 1 = 10

    int 2 = 5;

    3025 + 225 = 3250

    return 3250

     */
    public static int getSumOfSquares(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum * sum;
    }

    public static int substSquare(int num1, int num2) {
        int getNum1 = getSumOfSquares(num1);
        int getNum2 = getSumOfSquares(num2);

        return getNum1 + getNum2;
    }


}
