package replit.methods;

import java.util.Scanner;

public class method3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        System.out.println(reverseString(s1));

    }

    public static String reverseString(String s1) {
        String input = s1;
        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }

        return String.valueOf(output);
    }
}
