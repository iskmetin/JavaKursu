package Ömer.Mentoring4_ArrayList_Methodlari;

import java.util.ArrayList;

public class Methods2 {
    public static void main(String[] args) {


        // todo          2 ayrı listeden ortak elemanları çıkarma
        ArrayList<String> a = new ArrayList<>();

        a.add("A");
        a.add("B");
        a.add("C");
        a.add("D");
        System.out.println("a =  " + a);

        ArrayList<String> b = new ArrayList<>();

        b.add("C");
        b.add("D");
        b.add("E");
        b.add("F");
//
        System.out.println("b =  " + b);
//        a.removeAll(b); // a 'dan, b ile ortak olan elemanları çıkart.
//
//        System.out.println(a);
////
////        b.removeAll(a);
////        System.out.println(b);


    }
}

