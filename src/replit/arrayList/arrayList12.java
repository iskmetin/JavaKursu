package replit.arrayList;

import java.util.ArrayList;

public class arrayList12 {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int min = 20;
        int max = 30;
        a.add(1);
        a.add(5);
        a.add(22);
        a.add(10);
        a.add(20);
        a.add(14);
        a.add(8);
        a.add(25);
        a.add(30);
        a.add(28);
        System.out.println(rangeBtw(a, min, max));
    }

    public static int rangeBtw(ArrayList<Integer> a, int b, int c) {
        int count = 0;

        for (int i : a) {
            if (i >= b && i <= c) {
                count++;
            }
        }

        return count;

    }

}