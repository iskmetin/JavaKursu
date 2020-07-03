package Tahir;

public class Soru1 {
    public static void main(String[] args) {
          /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */

        String str = "Hello  World";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

    /*    String dizi[] = str.split("l",str.length()); // [H, e, l, l, o,  , W, o, r, l, d] 11

        for (int i = 0; i <dizi.length ; i++) {
            System.out.println(dizi[i]);
        }

     */


    /*    for (int i = dizi.length-1; i >=0 ; i--) {
            System.out.print(dizi[i]);
        }

     */


    }
}
