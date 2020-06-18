package replit.arrays;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int sayi = 123;

        char[] chars  = String.valueOf(sayi).toCharArray();

        char [] dizi=new char [chars.length];
        for(int i=0;i<chars.length;i++ ){
            dizi[i]= chars[(chars.length-i)-1];


        }
        System.out.println(dizi);
    }
}
