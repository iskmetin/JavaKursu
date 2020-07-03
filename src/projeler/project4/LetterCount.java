package projeler.project4;

import java.util.LinkedHashMap;

public class LetterCount {
    public static void main(String[] args) {
        String str = "aabbbcccc";
        System.out.println(charCount(str));

    }


    /*
            Given one String
            Get an each char from String return the count of the each char

            For Example

            String = aabbbcccc

            return should be a , 2
                             b , 3
                             c , 4

            Note: There could be any char in the String.

     */


    /*

            Verilen bir String
            String'den her bir char alın, her bir char'ın sayısını döndür

            Örnek:

            String = aabbbcccc

            return     a , 2     olmalı
                       b , 3
                       c , 4

            Not: Stringde herhangi bir char olabilir.

     */


    public static LinkedHashMap<Character, Integer> charCount(String myStr) {

        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();
        char[] dizi= myStr.toCharArray();

        int miktar = 0;
        for (int i = 0; i < dizi.length; i++) {
            miktar = 0;
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] == dizi[j])
                    miktar++;


            }
            result.put(dizi[i],miktar);
        }
        return result;
    }
}


