package replit.arrays;

public class ArrayWithForIf {
    public static void main(String[] args) {
        // code start here
        int[] seri = {5, 6, 8, 12, 14, 19};
        int sum = 0;
        int i = 0;
        while (i < seri.length) {
            if (seri[i] % 2 == 0) {
                sum = sum + seri[i];
            } else if (seri[i] % 2 == 1) {
                sum = sum - seri[i];
            }

            i++;
        }
        System.out.print(sum);
    }
}
