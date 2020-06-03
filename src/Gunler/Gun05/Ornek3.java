package Gunler.Gun05;

public class Ornek3 {
    public static void main(String[] args) {
        // short ve byte cinsinden 2 değer tanımlayınız, değer atayınız
        // short u byte türüne çeviriniz.Taşan ve taşmayan değerler vererek
        // çıkan sonuçları dğerlendiriniz.

        short sayi1 = 126;
        short sayi2 = 200;

        byte sayi3 = (byte) sayi1;
        byte sayi4 = (byte) sayi2;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        System.out.println("sayi3 = " + sayi3);
        System.out.println("sayi4 = " + sayi4);

    }
}
