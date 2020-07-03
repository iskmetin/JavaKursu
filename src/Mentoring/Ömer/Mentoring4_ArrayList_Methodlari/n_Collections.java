package Ömer.Mentoring4_ArrayList_Methodlari;

import java.util.ArrayList;
import java.util.Collections;

public class n_Collections {
    public static void main(String[] args) {


        ArrayList<Integer> sayi = new ArrayList<>();
        sayi.add(5);
        sayi.add(88);
        sayi.add(4);
        sayi.add(23);


        System.out.println("ilk hal :  " + sayi);
//                      SIRALAMA
        Collections.sort(sayi);

        System.out.println("sıralı :  " + sayi);

        //                          MAX -MİN
        System.out.println("Max sayı :  " + Collections.max(sayi));
        System.out.println("Min sayı :  " + Collections.min(sayi));


        //                          LİSTEYİ TERS ÇEVİRME
        Collections.reverse(sayi);
        System.out.println("tersten yazdırma :  " + sayi);

        Collections.fill(sayi, 1);
        System.out.println("fill(); methodu :  " + sayi);


    }
}

