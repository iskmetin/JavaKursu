package replit.arrayList;

import java.util.ArrayList;

public class array1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(1);

        System.out.println(duplicate(a));
    }

    public static boolean duplicate(ArrayList<Integer> a) {
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i : a) {
            if (!b.contains(i)) {
                b.add(i);
            }
        }
        boolean kopyali = false;
        if (b.size() != a.size()) {
            kopyali = true;
        }


        return kopyali;

    }
}