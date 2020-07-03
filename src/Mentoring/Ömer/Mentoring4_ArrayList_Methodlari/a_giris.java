package Ömer.Mentoring4_ArrayList_Methodlari;

import java.util.ArrayList;

public class a_giris {

    public static void main(String[] args) {


        ArrayList<String> str = new ArrayList<String>();
        ArrayList<Integer> intAr = new ArrayList<Integer>();


        System.out.println("----                ELEMAN EKLEME                  ------ \n ");
        //                todo                           Ekleme


        str.add("ömer");
        str.add("ahmet");
        str.add("sema");
        str.add("hüseyin");
        str.add("fatih");


        intAr.add(1);
        intAr.add(2);
        intAr.add(3);
        intAr.add(4);
        intAr.add(5);

        //                             yazdırma
        System.out.println("Str : " + str);
        System.out.println("intAr : " + intAr);

//        //belli bir indekse eleman ekleme:
//
//        str.add(1,"furkan");
//        System.out.println("Str:  " + str);
//        intAr.add(2,99);
//        System.out.println("intAr : " + intAr);
////
//
//
//
//        //todo          ------                                            ARRAYLİST'İN UZUNLUĞUNU BULMA            -------------
//        System.out.println(" \n  \n ----------                ARRAYLİST'İN UZUNLUĞUNU BULMA      ---------   \n" );
//
//
//        System.out.println(str);
//        System.out.println("str 'nin uzunluğu:  " + str.size());
////
////
////
////
////        //todo          ------                                             BELİRTİLEN INDEKSTEKİ ELEMANI ÇAĞIRMA            -------------
//        System.out.println(" \n ----------                INDEKSTEKİ ELEMANI ÇAĞIRMA      ---------   \n" );
////
////
////
////
//        System.out.println(" Str   - 2. indeksteki eleman:  " + str.get(2));
////
//        System.out.println("intAr  - 2. indeksteki eleman:  " + intAr.get(2));
////
////
////
////
////
////
////        //todo         --------                              INDEKSTEKİ ELEMANI DEĞİŞTİRME  -------------------------------
//        System.out.println(" \n ----------                INDEKSTEKİ ELEMANI DEĞİŞTİRME      ---------   \n" );
////
////
////
////
////
//        str.set(2,"mehmet");
////
//        System.out.println("2. elemanı değiştir " + str); //
//
//        intAr.set(3,99999);
//        System.out.println("3. elemanı değiştir :   " +intAr );
////
////
////
////
////
////
////
////        //todo         --------                              ArrayList'in boş olup olmadığını check etme --  Tüm listeyi temizleme  -------------------------------
//        System.out.println(" \n ----------                Array List'in boş olup olmadığını check etme -- Listeyi temizleme     ---------   \n" );
////
////
////
////
////
////
//
//        System.out.println("1.Liste boş mu ? --- >    " + str.isEmpty());
////
//       str.clear();
//        System.out.println("2.Liste boş mu ? --- >   " + str.isEmpty());
//        System.out.println(str);
////
//
////
////        //todo         --------                             BİR     ELEMANIN     İNDEKSİNİ      BULMA  -------------------------------
//        System.out.println(" \n ----------              BİR ELEMANIN İNDEKSİNİ BULMA     ---------   \n" );
////
////
////
////
////
//        System.out.println("ilk hali : " + intAr);
//        System.out.println(" '2' elemanı kaçıncı indekstedir ?  -> " + intAr.indexOf(2));
////
//////
//       intAr.add(6,2);
//////
//        System.out.println("sonraki hali:  " + intAr);
//       System.out.println(intAr.lastIndexOf(2));
//


    }
}
