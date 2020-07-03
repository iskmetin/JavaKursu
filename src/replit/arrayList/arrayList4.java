package replit.arrayList;

import java.util.ArrayList;

public class arrayList4 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        a.add("yellow");
        a.add("red");
        a.add("blue");
        a.add("red");
        a.add("blue");
        System.out.println(changeInArraylist(a, "blue", "yellow"));
    }

    public static ArrayList<String> changeInArraylist(ArrayList<String> a, String s1, String s2) {
        ArrayList<String> b = new ArrayList<String>();
        for (String i : a) {
            if (i == s1) {
                b.add(s2);
            } else {
                b.add(i);
            }
        }
        return b;
    }

}