package replit.methods;

import java.util.Scanner;

public class method4 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();
        System.out.println(reverseWord(myStr));
    }

    public static String reverseWord(String myStr) {

        String[] useThisArray = myStr.split(" ");

        String yeni="";
        String[] useThisArray2 = new String[useThisArray.length];
        for (int i = 0; i < useThisArray.length; i++) {
            useThisArray2[i] = useThisArray[(useThisArray.length - i) - 1];
            yeni=yeni +String.valueOf(useThisArray[(useThisArray.length - i) - 1])+" ";
        }

        return yeni.substring(0,(yeni.length()-1));


    }

}

