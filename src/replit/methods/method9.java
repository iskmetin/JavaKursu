package replit.methods;

import java.util.Scanner;

public class method9 {
    public static void main(String[] args) {
       /* findTheDifference isminde bir method oluşturun.
        iki String'den oluşmalı.
return  veri tipi char olmalı.
Bu iki string'e  s  ve t  ismini veriniz ve küçük harflerden oluşan değerler giriniz.
 String t, rastgele karıştırma dizgileri String s tarafından oluşturulur ve daha sonra rastgele bir konuma bir harf daha ekler. String t ye  eklenen harfi bulun. (String s 'te olup, String t 'de olmayan elemanı yazdırın.)
        Örn:
        Girdi:
        s = "abcde"
        t = "abcd"

        Çıktı:
        e
        Açıklama:
        'e' harfi eklenmiştir.

        s = "qawer"
        t = "rewq"

        Çıktı:
        a

        Açıklama:
        'a' harfi eklenmiştir.
*/

    Scanner oku=new Scanner(System.in);
        System.out.println("string gir");
        String s=oku.nextLine();
        System.out.println("ilk stringin alt kumesi  string gir");
        String t=oku.nextLine();
        System.out.println("farkli olan char "+findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        char[] sDizi = s.toCharArray();
        char farkli=' ';
        for (int i = 0; i < sDizi.length; i++) {
            if (t.indexOf(sDizi[i]) < 0) {
                farkli= sDizi[i];


            }
        }
        return farkli;
    }
}
