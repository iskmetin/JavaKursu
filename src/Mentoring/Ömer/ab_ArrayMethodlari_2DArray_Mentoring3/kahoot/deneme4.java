package Ömer.ab_ArrayMethodlari_2DArray_Mentoring3.kahoot;

import java.util.Arrays;

public class deneme4 {

    public static void main(String[] args) {


int [] a = {1,2,3,4,5,5,7,8,9};

        System.out.println("Dizinin ilk hali : " + Arrays.toString(a));

        Arrays.fill(a,5);
        System.out.println("Bir method kullandıktan sonra: " + Arrays.toString(a));

    }
}
