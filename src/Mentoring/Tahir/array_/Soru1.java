package Tahir.array_;

import java.util.Arrays;

public class Soru1 {
    public static void main(String[] args) {
        /* TODO Congratulations kelimesini Array yontemlirini kullanarak asagidaki outputu alin.

        [C, o, n, g, u, r, a, t, u, l, a, t, i, o, n, s]
        [s, n, o, i, t, a, l, u, t, a, r, u, g, n, o, C]
        snoitalutarugnoC
        Cingritilitiins  // o ,a ve u harfini i ye donuster

         */
        String str = "Congratulations";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        System.out.println("***********************************************");

        int counter = 0;
        String[] yeniArr = new String[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            yeniArr[counter++] = arr[i];
            // yeniArr[0]=arr[14]
            // yeniArr[1]=arr[13]
            // yeniArr[2]=arr[12]
            // yeniArr[3]=arr[11]
            // yeniArr[4]=arr[10]
            // yeniArr[5]=arr[5]
            // yeniArr[6]=arr[4]
            // yeniArr[7]=arr[3]
            // yeniArr[8]=arr[2]
            // yeniArr[9]=arr[1]
            // yeniArr[10]=arr[0]
            // .........
            // yeniArr[14]=arr[0]

            //y

        }

        System.out.println(Arrays.toString(yeniArr));


    }
}
