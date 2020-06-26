package Gunler.Gun24;
import java.util.ArrayList;

public class JavaArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        list1.add("Almanca");
        list1.add("İngilizce");
        list1.add("Türkçe");
        list1.add("Rusça");


        System.out.println("list1 = " + list1);

        ArrayList<String> list2=new ArrayList<>();
        list2.add("Rusça");
        list2.add("Türkçe");
        list2.add("Arapça");

        System.out.println("list2 = " + list2);

//        list1.removeAll(list2);
//        System.out.println("list1 = " + list1);
        
        // parantez içindeki listeyi , 1.listeye ekler
//        list1.addAll(list2);
//        System.out.println("list1 = " + list1);

        // eklenecek listeyi belirtilen indexten itibaren ekler.
        list1.addAll(2,list2);
        System.out.println("list1 = " + list1);

        if (list1.contains("Türkçe"))
        {
            System.out.println("Türkçe dili var");
        }

        // indexOf,  lastIndexOf, toArray  aynı dizilerdeki gibi

    }
}
