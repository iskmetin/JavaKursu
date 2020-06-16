package Ömer.a_Switch_Case_Mentoring_2;

import java.util.Scanner;

public class NestedIfElse1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);



        System.out.print("sayi =");
        int sayi = sc.nextInt();

        if (sayi < 100) {
            System.out.println("100 den küçük");

            if (sayi < 50) {
                System.out.println("50 den de küçük");

                if (sayi < 25) {
                    System.out.println("25 ten  de küçük");

                }
            }
        }else
            System.out.println("100 den büyüktür.");

    }
    }

