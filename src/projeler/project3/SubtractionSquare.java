package projeler.project3;

import java.util.Scanner;

public class SubtractionSquare {

    /*

     /*

    Given one method name is substSquare
    This method get two ints as parameter
    return type is int
    Get  square of the sum of the numbers using getSumOfSquares method ,
    Parameter 1 square of the sum + Parameter 2 square of the sum  = your result
     */
    /*

    for example:
    int 1 = 10

    int 2 = 5;

    3025 + 225 = 3250

    return 3250

     */




    /*
   substSquare isminde bir method verildiğinde
   bu method parametre olara iki int alır
   return tipi int olur

   getSumOfSquares methodunu kullanarak


Parameter 1 toplamin karesi+Parameter 1 toplamin karesi= sonuc


   Örnek:

    int 1 = 10;              yazacağınız method 10 u kullanarak 3250 sonucu verir

    int 2 = 5;                yazacağınız method 5 i kullanarak 225 sonucu verir

    3025 + 225 = 3250

    return 3250
    */
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int num1=oku.nextInt();
        System.out.println("ikinci bir sayi giriniz");
        int num2=oku.nextInt();
        System.out.println(substSquare(num1,num2));
    }


        public static int  substSquare(int num1, int num2){
            int sum1=0,sum2=0;
            for(int i=1;i<=num1;i++){
                sum1+=i;
            }
            for(int i=1;i<=num2;i++){
                sum2+=i;
            }


            return (sum1*sum1)+(sum2*sum2);
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





}
