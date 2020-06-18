package replit.arrays;
import java.util.Arrays;
public class array2dsum {
    public static void main(String[] args) {


    int[][] dizi = {{5, 2, 1}, {10, 2, 3, 6}, {1, 2}};
    int sum=0;
    for( int i = 0; i<dizi.length; i++){
            for (int a = 0; a < dizi[i].length; a++) {
                sum = sum + dizi[i][a];


        }
    }
        System.out.println(sum);

} }