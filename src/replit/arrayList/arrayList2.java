package replit.arrayList;

import java.util.ArrayList;

public class arrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(4);

        System.out.println(getSum(a));
    }

    public static int getSum(ArrayList<Integer> a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

}