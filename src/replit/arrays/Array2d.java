package replit.arrays;

import java.util.Arrays;

public class Array2d {
    public static void main(String[] args) {
        int[][] dizi = {{2, 3, 2}, {4, 1, 5}, {7, 2, 5}};
        for (int i = 0; i < dizi.length; i++) {
            for (int a = 0; a < dizi[i].length; a++) {
                if(dizi[i][a]==2){
                    dizi[i][a]=6;
                }

            }
        }
        System.out.println(Arrays.deepToString(dizi));
    }
}
