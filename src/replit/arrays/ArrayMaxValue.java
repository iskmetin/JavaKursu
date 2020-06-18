package replit.arrays;

public class ArrayMaxValue {
    public static void main(String[] args) {

        // code start here
        int[] seri = {12, 2, 5, 15, 8};
        int i = 0;
        int max = 0;

        while (i < seri.length) {
            if (max < seri[i]) {
                max = seri[i];
            }
            i++;

        }
        System.out.print(max);


    }
}

