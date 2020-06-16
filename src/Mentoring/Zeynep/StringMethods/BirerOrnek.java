package Zeynep.StringMethods;

public class BirerOrnek {

    public static void main(String[] args) {
        //indexOf()

        String cicek = "Gunebakan";

        System.out.println("n harfinin indeksi -->> "+cicek.indexOf('n'));
        System.out.println("--------------");

        //lastIndexOf()

        System.out.println("n harfinin sondan indeksi -->> "+cicek.lastIndexOf('n'));
        System.out.println("--------------");

        //charAt()

        String sehir = "istanbul";
        System.out.println("5.indexteki karakteri yazdir >>>>> " + sehir.charAt(5));
        System.out.println("------------");

        //substring()

        String adim = "Yurdakul";

        System.out.println("5inci indexten baslayan dizi >>>>>>" + adim.substring(5));

        System.out.println("----------");

        String bilgi = "Isim: Ayse";

        int bosluk = bilgi.indexOf(" "); //bana boslugun basladigi indexi verecek
        System.out.println("Sadece Ayse ismini almak istiyorum >>>>" + bilgi.substring(bosluk+1));
        System.out.println("--------------");


        //trim()

        String ulke = "     Almanya    ";

        System.out.println("trim olmadan -->>"+ulke + "<<--");

        System.out.println("trim kullanildiktan sonra -->>" + ulke.trim());
        System.out.println("--------------");

        //replace()

        String ozellik = "hayalperest";

        System.out.println("a harfini @ ile degistirince " + ozellik.replace('a', '@'));



        String kuruyemis = "yer fistigi";

        System.out.println("bir diziyi degistirme " + kuruyemis.replace("yer", "sam")); //karakterin buyuk kucuk olmasi onemli "Yer yazmak gibi

        System.out.println("--------------");

        //replaceAll()

        String number2 ="$1800milyon";

        number2 = number2.replaceAll("[a-z]" , "");

        System.out.println(number2);
        System.out.println("--------------");


        //equals() - equalsIgnoreCase()

        String ad = "Bahadir";
        System.out.println("yazildigi gibi >>>>" + ad.equals("Bahadir"));
        System.out.println("bas harfi yazildigindan farkli >>>>" + ad.equals("bahadir"));  //false verecek cunku kucuk-buyuk harf hassasiyeti var


        //bu durumda equalsIgnoreCase() kullanmak cok daha mantikli

        System.out.println("kucuk buyuk harf hassasiyeti yoksa >>>>" + ad.equalsIgnoreCase("baHadir"));
        System.out.println("--------------");

        //contains

        String sahipMi = "Baha";
        System.out.println("ad degiskeni icinde Baha yi bulunduruyor mu? >>>> " + ad.contains(sahipMi));
        System.out.println("--------------");

        //startsWith() - endsWith()
        System.out.println("ad degiskeni Ba ile basliyor mu?   " + ad.startsWith("Ba")); //kucuk buyuk harfe duyarli
        System.out.println("ad degiskeni -dir ile bitiyor mu?   " + ad.endsWith("dir"));
        System.out.println("---------------");

        // toUpperCase() - toLowerCase()

        String mevsim = "Ilkbahar";
        System.out.println("metni buyuk harf ile yazdiralim >>>> " + mevsim.toUpperCase());
        System.out.println("metni kucuk harf ile yazdiralim >>>> " + mevsim.toLowerCase());
        System.out.println("--------------");

    }
}
