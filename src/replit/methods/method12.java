package replit.methods;

import java.util.Scanner;

public class method12 {


    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.println("Bir sayi gir");
        int t = oku.nextInt();

        System.out.println(powerOfThree(t));
    }

    public static boolean powerOfThree(int n) {
        if(n==0)
            return false;

        if(n==1)
            return true;

        if(n>1)
            return n%3==0 && powerOfThree(n/3);
        else
            return false;
    }}