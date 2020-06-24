package replit.methods;

import java.util.Arrays;
import java.util.Scanner;

public class method15 {


    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.println("Bir sayi dizisi gir");
        String[] t = oku.nextLine().split(" ");
        int[] a = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            a[i] = Integer.parseInt(t[i]);
        }




        System.out.println("tekrarsiz dizi mi?: "+isUnique(a));
    }

    public static boolean isUnique(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    array[i] = array[j];
                    array[j] = min;
                    min = array[i];
                }
            }

        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                return false;
            }
        }

        return true;
    }
}