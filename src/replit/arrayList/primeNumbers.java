package replit.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("bir numara gir");
        int sayi = oku.nextInt();
        System.out.println(primeNum(sayi).size());
    }

    public static ArrayList primeNum(int b) {
        ArrayList<Integer> dizi = new ArrayList<Integer>();

        for (int i = 0; i < b; i++) {
            if (isPrime(i)) {
                dizi.add(i);
            }
        }
        return dizi;
    }

    public static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}








