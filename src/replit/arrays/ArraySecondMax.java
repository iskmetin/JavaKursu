package replit.arrays;

public class ArraySecondMax {
    public static void main(String[] args) {
        int[] seri = {15 , 25, 22, 18, 30};
        int i = 0;
        int max = 0;
        int second = 0;
        while (i < seri.length) {
            if (seri[i] > max) {
                second = max;
                max = seri[i];
            }

            /* If arr[i] is in between first and
               second then update second  */
            else if (seri[i] > second && seri[i] != max)
                second = seri[i];
            i++;
        }
        System.out.print(second);
    }
}