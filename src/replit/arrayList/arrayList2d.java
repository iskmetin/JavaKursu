package replit.arrayList;

import java.util.ArrayList;

public class arrayList2d {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        System.out.println(join(a));


    }

    public static ArrayList<Integer> join(int[][] a) {
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            for (int x = 0; x < a[i].length; x++) {
                b.add(a[i][x]);

            }

        }


        return b;

    }

}