package Gunler.Gun24;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        int[] dizi=new int[]{2,3,4,5}; // dizilerde btanımlarken başlangıç değerler verebiliyorduk
        // ArrayList de de başlangıç değerlerini bir seçenek olarak istersek aşağıdaki gibi verebiliriz.
        ArrayList<String> list1=new ArrayList<>(){
            {
                add("Almanca");
                add("İngilizce");
                add("Türkçe");
                add("Rusça");
            }
        };

        System.out.println("list1 = " + list1);

        ArrayList<String> list2=new ArrayList<>();
        list2.add("Rusça");
        list2.add("Türkçe");
        list2.add("Arapça");

        System.out.println("list2 = " + list2);

        list1.removeAll(list2);
        System.out.println("list1 = " + list1);
    }
}
