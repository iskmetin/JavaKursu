package replit.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Array_no14 {



    public static void main(String[] args) {
        // code start here

        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();

        String[] arr1 = str1.split(" ");

        int[] intArr = new int[arr1.length];

        int count = 0;

        for(int i = 0 ; i < intArr.length ; i++){

            int i1 = Integer.parseInt(arr1[i]);

            intArr[count] =i1;

            count++;
        }

        // your code start here
        // use intArr
        boolean result = IntStream.of(intArr).anyMatch(x -> x == 4);
        boolean result2 = IntStream.of(intArr).anyMatch(x -> x == 1);
        System.out.print(!(result&result2));
    }}