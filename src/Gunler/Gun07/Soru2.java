package Gunler.Gun07;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        // Soru 2 : Kullanıcıdan tek bir komutla okunan 2 kelimelik ad ve soyadı ,
        // (tek okuma da ad ve soyadı alınız -> "Adınızı ve Soyadınızı giriniz")
        // ekrana ilk harfleri ve nokta şekilde
        // yazdırınız.Örnek Ahmet Yılmaz -> A.Y.

        System.out.print("Adınız ve soyadınız = ");
        Scanner oku = new Scanner(System.in);
        String adSoyad = oku.nextLine(); // birden fazla kelime , yani satırı tümden okuyoruz

        char adIlkHarf = adSoyad.charAt(0);
        int boslukNerde = adSoyad.indexOf(" "); // bu indexin 1 fazlası herzaman soyadın ilk harfidir.
        char soyadIlkHarf = adSoyad.charAt(boslukNerde + 1);

        System.out.println(adIlkHarf + "." + soyadIlkHarf + "."); //  örneğin A.Y.
    }
}
