package projeler.project3;

import java.util.Arrays;

public class CamelCase3 {
    public static void main(String[] args) {



    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       For Example:

            my family live in united states

      Result should be

            My Family Live In United States

     */

    /*
            İlk harf büyük harfe
           parametre bir String dir
           return  türü String
          kelımeler arası tek boşluk ile sınırlandırılmalı
         Tüm kelimelerin ilk harfi camel case olmalıdır

       Örnek:

            my family live in united states

      Result :

            My Family Live In United States


     */
        System.out.println(camelcase("my family live in united states"));
    }
    public static String camelcase(String sentence){
        String[] sentencedizi=sentence.split(" ");

        for(int i=0; i<sentencedizi.length;i++){
            sentencedizi[i]=sentencedizi[i].substring(0,1).toUpperCase() + sentencedizi[i].substring(1);
        }

        String str = String.join(",", sentencedizi).replaceAll(","," ");
       // String str =Arrays.deepToString(sentencedizi);


        return str;
    }


}
