package replit.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList8 {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(5);
        a.add(3);
        a.add(4);
        a.add(6);
        a.add(7);
        System.out.println(secondMax(a));
    }

    public static int secondMax(ArrayList<Integer> a) {
        Collections.sort(a);

        return a.get(a.size() - 2);

    }

}