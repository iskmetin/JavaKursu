package Gunler.Gun07;

public class StringIndexOf {
    public static void main(String[] args) {
        // Verilen karakter(ler) in string içerisindeki başlangıç indexini verir
        // contains den farkı indexini verir, contains ise true false
        String text = "Good";

        System.out.println("G harfinin indexi = " + text.indexOf("G")); // indexler 0 dan başlar
        System.out.println("d harfinin indexi = " + text.indexOf('d'));
        System.out.println("H harfinin indexi = " + text.indexOf("H")); // -1 bulunamadı, yok
        System.out.println("od nin indexi = " + text.indexOf("od")); // var ise ilk harfin indexini verir
        int index = text.indexOf("o"); // int değişkene atanabilir. küçük o harfi
        System.out.println("index = " + index); // birden fazla var ise ilkini verir
    }
}
