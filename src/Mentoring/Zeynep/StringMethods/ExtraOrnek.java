package Zeynep.StringMethods;

import java.util.Scanner;

public class ExtraOrnek {

    public static void main(String[] args) {
        //todo ornek1:

        //metindeki r karakterini ^ karakteri ile degistiriniz

        String cumle = "Buralardan gelip gecen pek coktur.";

        System.out.println(cumle.replace('r','^'));

        System.out.println(cumle.replace('r', '^').replace('l', '`').replace('p', 'b'));

        System.out.println(cumle.replaceAll("[rlp]", "^"));

        System.out.println("-------------");

        //todo ornek2:

        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("ilki giriniz");
        String ilk = scan.nextLine();
        System.out.println("ikinciyi giriniz");
        String ikinci = scan.nextLine();

        String tamami = ilk.concat(ikinci);
        System.out.println("metnin tamami: " + tamami);

        System.out.println("------------");

        //todo ornek2.1:

        //ikinci ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.


        //birinci yol

        String basiOlmadanIlk = ilk.substring(1);
        String basiOlmadanIkinci = ikinci.substring(1);

        System.out.println("baslari olmadan tamami >>>" + basiOlmadanIlk.concat(basiOlmadanIkinci));

        //ikinci yol

        int bNinIndeksi = tamami.indexOf("b"); //b nin oldugu indeksi verecek ama bize hemen ardindaki lazim
        System.out.println("b nin bulundugu indks >>> " + bNinIndeksi);
        String yeniTamami = tamami.substring(1,bNinIndeksi).concat(tamami.substring(bNinIndeksi+1));
        System.out.println("ikinci cozum >>>>>" + yeniTamami);

        //todo ornek3:

        //1.kisim>>> icerisinde renk gecen bir metin yaziniz ve bu rengin metin icinde olup olmadigini kontrol edin.

        String renkli = "ileride yesil ovalar var";

        System.out.println(renkli.contains("yesil"));

        //2.kisim>>> rengin oldugu kismi baska bir renk ile degistiriniz

        System.out.println(renkli.replace("yesil", "mavi"));

    }
}
