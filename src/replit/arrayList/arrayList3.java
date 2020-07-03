package replit.arrayList;

import java.util.ArrayList;

public class arrayList3 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        a.add("New jersey");
        a.add("New york");
        a.add("Ohio");
        a.add("Florida");
        a.add("Boston");

        System.out.println(getLength(a));
    }

    public static ArrayList<Integer> getLength(ArrayList<String> a) {
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (String i : a) {
            b.add(i.length());
        }
        return b;
    }

}