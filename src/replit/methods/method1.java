package replit.methods;

import java.util.Random;
import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int max = scn.nextInt();
        System.out.println(randomNum(max));
    }

    public static int randomNum(int max) {
        Random r = new Random();
        return r.nextInt(max);

    }
}

