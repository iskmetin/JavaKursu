package Odevler.Hafta1;

public class Odevler {

    public static void main(String[] args) {


        System.out.println("----------SORU 1 ------------------");
       /*

        TODO    -- ÖDEVLER --


        //En sevdiğiniz 3 meyveyi alt alta yazdırınız.
*/

        System.out.println("Elma");
        System.out.println("Armut");
        System.out.println("Erik");
        System.out.println("------2. yol-----");
        System.out.println("Elma" + "\n" + "Armut" + "\n" + "Erik");


        System.out.println("----------SORU 2 ------------------");
/*


                        2.--------------------
Yukarıda yazdırmış olduğunuz meyveleri, başında tırnak işareti ile yazdırınız.
    Örn:Konsolda şöyle olmalı:   "Elma"
                                                      "Armut"
                                                      "Limon"

*/

        System.out.println("\"Elma\"");
        System.out.println("\"Armut\"");
        System.out.println("\"Erik\"");

        System.out.println("-----2.Yol ------");
        System.out.println("\"Elma\"" + "\n" + "\"Armut\"" + "\n" + "\"Erik\"");


        System.out.println("----------SORU 3 ------------------");
        /*

                    3.-------------

                    Bir String oluşturun ve ismi    'marka' olsun.

                   String marka  nın değeri, kullandığınız telefonun markasın olsun.

                   String marka 'yı print edin.
*/

        String marka = "Iphone";
        System.out.println("Telefonumun markası: " + marka);


        System.out.println("----------SORU 4 ------------------");
    /*               4-------------

                   String ad        oluşturun. -- Değeri kendi isminiz olsun.
                   String soyad  oluşturun-- Değeri kendi soyisminiz olsun.
                  int yas              oluşturun. -- Değeri kendi yaşınız olsun.

                  Konsolda aynen şu yazmalı:             Benim adım Ömer Özdemir'dir ve ben 23 yaşındayım.

                not:  (Kendi bilgilerim ile örnek verdim, siz kendi bilgileriniz ile dolduracaksınız...
                                                Oluşturduğunuz String ve int değerlerini kullanın!.)
*/

        String ad = "Ömer";
        String soyad = "Özdemir";
        int yas = 23;

        System.out.println("Benim adım " + ad + " " + soyad + "'dir ve ben " + yas + " " + "yaşındayım.");


        System.out.println("----------SORU 5 ------------------");
     /*              5----------

                    int a  oluşturun. Değeri 25
                    int b oluşturun. Değeri  50

                    bu iki integeri toplayın ve sonucu yazdırın.

                    konsolda şöyle yazmalı: 25 + 50 = 75
*/

        int a = 25;
        int b = 50;

        int toplam = a + b;
        System.out.println(a + " + " + b + "=" + toplam);
        System.out.println("25+50 =" + toplam);

//        System.out.println("Toplamları = " + a+b);
//        System.out.println("Toplamları = " + (a+b));


        System.out.println("----------SORU 6 ------------------");
    /*                6-----------

                  short s oluşturun. Değeri 15 olsun.
                  short h oluşturun. değeri 30 olsun.

                  Bu iki short 'un toplamını  short toplam ' a eşitleyin.

                  short toplamı yazdırın. */

        short s = 15;
        short h = 30;

        short topla = (short) (s + h);
        System.out.println("Toplam= " + topla);


        System.out.println("----------SORU 7 ------------------");
        /*7-----------



          double aylik oluşturun. -- Değeri 30.5 olsun.
              int  aySayisi oluşturun. -- değeri 9 olsun.

                    Aylık 30.5 Euro olan fitness salonuna 9  aylık kayıt yaptırıyorsunuz.

            double toplamFiyat   oluşturun ve sonucu yazdırın.     (Çarpma işlemi        *    ile yapılır. )

           Örn: Konsolda şöyle yazmalı:                    Toplam fiyat : 274.5 Euro */


        double aylik = 30.5;
        int aySayisi = 9;

        double toplamFiyat = aylik * aySayisi;

        System.out.println("Toplam Fiyat: " + toplamFiyat + "Euro");


        System.out.println("----------SORU 8 ------------------");
        /*        8---------------




   int number1 oluşturun ve değeri 100 olsun.
   double number2 oluşturun ve değeri 67.7  olsun.
   short number 3 oluşturun ve değeri 44 olsun.

   Bu 3 değişkeni birbiri ile toplayın ve double toplam2 ' ye eşitleyin.
   toplam2 yi Stringe dönüştürün.
   String i yazdırın.
*/

        int number1 = 100;
        double number2 = 67.7;
        short number3 = 44;

        double toplam2 = number1 + number2 + number3;
        String toplamString = Double.toString(toplam2);

        System.out.println("Toplam String Hali = " + toplamString);


        System.out.println("----------SORU 9 ------------------");
    /*        9--------------------------------------


int k oluşturun ve değeri 40 olsun.
int l oluşturun ve değeri k'nın değerinin 2 katı olsun.         (Direkt 80 yazmayın, denklem kurarak yazın)  (Çarpma işlemi   *  simgesi ile yapılır)
int m oluşturun ve  değeri, int k ile int l ' nin toplamdan 35 eksik olsun.

int sonuc oluşturun ve bu üç değişkeni birbiri ile toplayın.

sonucu double s 'a döndürün ve
 double sonuc'u yazdırın. */


        int k = 40;
        int l = k * 2;
        int m = (k + l) - 35;

        int sonuc = k + l + m;


        System.out.println("Sonuç: " + sonuc);


    }


}
