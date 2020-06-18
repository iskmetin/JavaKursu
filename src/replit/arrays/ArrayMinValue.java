package replit.arrays;

public class ArrayMinValue {
    public static void main(String[] args) {


        int[] seri = {14, 19, 5, 21, 8};
        int i = 0;
        int min = seri[0];

        while (i < seri.length) {
            if (min > seri[i]) {
                min = seri[i];
            }
            i++;

        }
        System.out.print(min);
    }}