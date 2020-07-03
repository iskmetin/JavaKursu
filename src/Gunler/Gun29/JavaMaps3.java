package Gunler.Gun29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMaps3 {
    public static void main(String[] args) {
        // HashMap, LinkedHashMap, TreeMap

        // Hash Algoritmasına göre sakladı key bazlı, döngülerde hızlı olması için
        Map<Integer,String> hm=new HashMap<>();
        hm.put(9,"fox");
        hm.put(2,"cat");
        hm.put(30,"dog");
        hm.put(4,"swan");
        hm.put(7,"bear");
        hm.put(11,"snake");

        System.out.println("hm = " + hm); // hm = {2=cat, 4=swan, 7=bear, 9=fox, 11=snake, 30=dog}

        // Eklenme sırasına göre sakladı key bazlı
        Map<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(9,"fox");
        lhm.put(2,"cat");
        lhm.put(30,"dog");
        lhm.put(4,"swan");
        lhm.put(7,"bear");
        lhm.put(11,"snake");

        System.out.println("lhm = " + lhm); // lhm = {9=fox, 2=cat, 30=dog, 4=swan, 7=bear, 11=snake}

        // keyleri baz alarak harf veya rakamları küçükten büyüğe sıralayarak saklar
        Map<Integer,String> tm=new TreeMap<>();
        tm.put(9,"fox");
        tm.put(2,"cat");
        tm.put(30,"dog");
        tm.put(4,"swan");
        tm.put(7,"bear");
        tm.put(11,"snake");

        System.out.println("tm = " + tm); //tm = {2=cat, 4=swan, 7=bear, 9=fox, 11=snake, 30=dog}
    }
}
