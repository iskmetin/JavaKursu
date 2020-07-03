package replit.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList5 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        a.add("yellow");
        a.add("red");
        a.add("blue");
        a.add("red");
        a.add("blue");
        System.out.println(rotateList(a));
    }

    public static ArrayList<String> rotateList(ArrayList<String> a) {
        ArrayList<String> b = new ArrayList<String>();
        Collections.reverse(a);
        return a;
    }

}