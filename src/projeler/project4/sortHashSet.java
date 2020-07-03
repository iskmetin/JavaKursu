package projeler.project4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class sortHashSet {
    public static void main(String[] args) {
        HashSet<Integer> allNumbers=new HashSet<Integer>();
        allNumbers.add(5);
        allNumbers.add(1);
        allNumbers.add(6);
        allNumbers.add(7);
        allNumbers.add(8);


        System.out.println(sort(allNumbers));
    }

    /*
        Given allNumbers Integer Hashset

        Sort the allNumbers hashset

        Change the result to ArrayList

        Return the ArrayList

        NOTE : DO NOT USE COLLECTION CLASS WHILE SOLVING THE QUESTION USE FOR LOOP OR DIFFERENT SET TYPES

     */

    /*
        Verilen  allNumbers Integer Hashset

         allNumbers hashset'i sort et

        Sonucu ArrayList olarak değiştir

        Return  ArrayList

        NOT : SORUYU ÇÖZERKEN COLLECTİON CLASS KULLANMA , FOR LOOP VEYA FARKLI SET TYPES KULLANIN


     */
    public static ArrayList<Integer> sort(HashSet<Integer> allNumbers) {

        ArrayList<Integer> result = new ArrayList<>();
        TreeSet<Integer> yeniSet = new TreeSet<Integer>();
        yeniSet.addAll(allNumbers);

        result.addAll(yeniSet);


        return result;
    }

}
