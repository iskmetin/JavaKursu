package Mentoring.StringMethods;

public class StringMethods {

    public static void main(String[] args) {


        /** indexOf()
         * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
         */
        // 012345678
        String cicek = "Gunebakan";

        int index = cicek.indexOf('e');
        System.out.println("e harfi metinde kacinci indexte >>>>> " + index);
        System.out.println("----------");

        /** lastIndexOf()
         *
         */

        System.out.println("sondaki n harfinin index >>>> " + cicek.lastIndexOf('n'));
        System.out.println("----------");

        /**
         * charAt()
         * Metin icerisinde, istenilen indexteki karaktere ulasimi saglar. Sonuc char dir.
         */

        String sehir = "istanbul";
        System.out.println("metinde 5 indexteki harf >>>> " + sehir.charAt(5));
        System.out.println("----------");

        /** substring()
         * Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
         */
        //     01234567
        String adim = "yurdakul";
        System.out.println("2. indexten sonrasi >>> " + adim.substring(2));
        System.out.println("3. index ile 5. index arasini yazdir>>>> " + adim.substring(3, 5));
        System.out.println("---------------");

        String bilgi = "isim: ayse";
        int bosluk = bilgi.indexOf(" "); //bu kisim bana boslugun indexini verecek

        System.out.println("boslugun indexi >>>" + bosluk);
        System.out.println(bilgi.substring(bosluk + 1));
        System.out.println("----------");

        /**trim()
         *Metnin basinda ve sonunda bulunan bosluklardan kurtulmayi saglar, aralardaki bosluklara dokunmaz. Sonuc String dir.
         */

        String ulke = "     Almanya    ";

        System.out.println("trim kullanilmadan once >>>>>> " + ulke + "<<<<<");
        System.out.println("trim kullanildiktan sonra -->>" + ulke.trim());
        System.out.println("----------");

        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini saglar. Sonuc String dri.
         *
         */

        String ozellik = "hayalperest";
        System.out.println("a harfini @ isarti ile degistir >>> " + ozellik.replace('a', '@'));

        String kuruyemis = "yer fistigi";

        System.out.println("bir dizi kumesini degistirme>>>> " + kuruyemis.replace("yer", "sam"));
        System.out.println("----------");

        /** replaceAll()
         *
         */

        String numara = "$1800 Milyon";

        System.out.println("REPLACEaLL METODU>>>> " + numara.replaceAll("[a-zA-Z]", ""));
        System.out.println("REPLACEaLL METODU>>>> " + numara.replaceAll("[0-9]", ""));
        System.out.println("----------");

        /**
         * contains()
         * Metin icerisinde arama yapmamizi saglar. Sonuc boolean dir.
         *
         * equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. Sonuc boolean dir.
         *
         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */

        String ad = "Bahadir";

        System.out.println("birebir ayni yazildiginda >>>" + ad.equals("Bahadir"));
        System.out.println("harfin kucuk olmasi durumunda >>>" + ad.equalsIgnoreCase("bahadir"));

        String sahipMi = "Baha";

        System.out.println("ad degiskeni icinde Baha yi barindiriyor mu? >>>> " + ad.contains(sahipMi));
        System.out.println("----------");

        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        System.out.println("metin Ba ile basliyor mu? >>>> " + ad.startsWith("Ba"));
        System.out.println("metin -dir ile bitiyor mu? >>>> " + ad.endsWith("dir"));
        System.out.println("----------");


    }
}
