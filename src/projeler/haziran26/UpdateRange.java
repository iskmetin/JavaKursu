package projeler.haziran26;

import java.util.Arrays;

public class UpdateRange {
    public static void main(String[] args) {

        int[] arr = {1, 12, 13, 14, 25, 16, 47, 28, 19, 3};
        int min = 10;
        int max = 20;

        System.out.println(Arrays.toString(uRange(arr, min, max)));

    }


    /*

    Create a method uRange

    parameters are int array and two ints

    if the int array has a number between the two int parameters change it to -1

    for Example
    int array = 1,6,12,15,22,18,30,16

    int 1 = 10

    int 2 = 20

    result should be 1,6,-1,-1,22,-1,30,-1

     */

    public static int[] uRange(int[] arr1, int min, int max) {
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > min && arr1[i] < max) {
                arr2[i] = -1;
            } else {
                arr2[i] = arr1[i];
            }

        }

        return arr2;
    }


}
