package replit.arrayList;

import java.util.ArrayList;

public class arrayList1 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        a.add("Orange");
        a.add("Kiwi");
        a.add("Peach");
        a.add("Banana");
        a.add("Orange");
        String b = "Orange";
        System.out.println(getCount(a, b));
    }

    public static int getCount(ArrayList<String> a, String b) {
        int count = 0;
        for (String i : a) {
            if (i == b) {
                count++;
            }
        }
        return count;
    }
}