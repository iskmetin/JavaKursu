package replit.arrayList;

import java.util.ArrayList;

public class arrayList7 {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(3);
        a.add(2);
        a.add(5);
        a.add(6);
        b.add(5);
        a.add(8);
        b.add(9);
        System.out.println(common_values(a, b));
    }

    public static ArrayList<Integer> common_values(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> yeni = new ArrayList<Integer>();

        for (int i : a) {
            if (b.contains(i)) {
                yeni.add(i);
            }


        }
        return yeni;

    }

}