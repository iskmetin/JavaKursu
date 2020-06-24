package replit.methods;

import java.util.Scanner;

public class method2 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        System.out.println(middleWord(s1));
    }

    public static String middleWord(String s1) {

        String[] splitted = s1.split(" ");
        final String s = splitted[((splitted.length - 1) / 2)];
        return s;

    }


}