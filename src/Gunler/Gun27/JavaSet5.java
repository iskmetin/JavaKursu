package Gunler.Gun27;

import java.util.Arrays;
import java.util.TreeSet;

public class JavaSet5 {
    public static void main(String[] args) {
        TreeSet<Integer> rakamlar = generateSet();  // 10 tane random rakamla doldursun
        System.out.println("rakamlar = " + rakamlar);
        System.out.println("rakamlar.size() 1= " + rakamlar.size());

        addElements(rakamlar, 10, 100, 100);
        addElements(rakamlar, 50);

        System.out.println("rakamlar = " + rakamlar);
        System.out.println("rakamlar.size() 2= " + rakamlar.size());

        int[] ints = convertToArray(rakamlar);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
    }

    // Set i diziye çevirem metod
    public static int[] convertToArray(TreeSet<Integer> set) {
        int[] yeni = new int[set.size()];

        int sayac = 0;
        for (Integer sayi : set) {
            //yeni[sayac++]=sayi; // Önce işlemi yap sonra sayacın değerini 1 artır

            yeni[sayac] = sayi;
            sayac++;
        }

        return yeni;
    }

    // Set e belli olmayan sayıda sayı ekleyen metod
    public static void addElements(TreeSet<Integer> set, int... values) {
        for (int i = 0; i < values.length; i++) {
            set.add(values[i]);
        }
    }

    // set üreten metod
    public static TreeSet<Integer> generateSet() {
        TreeSet<Integer> set = new TreeSet<>();

        // Burada set olduğundan aynı gelen sayılar eklenmeyeceğinden toplam 10 tane olmayabilir
//        for (int i = 0; i <10 ; i++) {
//            int randomSayi = (int)(Math.random()*100) +1;
//            set.add(randomSayi);
//        }
        // Tam 10 tane olması için aşağıdaki döngüye çevirdik.

        // bu şekilde size yani rakam sayısı 10 tane olana kadar döner
        while (set.size() < 10) {
            int randomSayi = (int) (Math.random() * 100) + 1;
            set.add(randomSayi);
        }
        return set;
    }
}
