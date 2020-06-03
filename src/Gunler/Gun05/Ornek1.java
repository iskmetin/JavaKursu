package Gunler.Gun05;

public class Ornek1 {
    public static void main(String[] args) {
        // 3 farklı tip de değişken tanımlayınız, değer atayınız ve ekrana yazdırınız.

        int sayi = 5;
        char ilkHarf = 'A';  // -> ben char tipinde bir veri saklayacağım, harf A olacak :
        // bilgisayar unicode A simgesinin karşılığı olan 65 sayısını buluyor.Hafızaya bunu yazıyor.
        // bu hafızaya char olduğuna ilşkin bir de uyarı set ediyor.

        char ilkHarfAyni = 65; // karakter hanesi olduğu kesin olan yere, sayı değer direk atanıyor.
        // Böylece yazdırırken yine 65 i tablodan bakıp harf olarak ekrana yazıyor.Çünkü char tipi.


        boolean cevap = true;

        System.out.println("sayi = " + sayi);
        System.out.println("ilkHarf = " + ilkHarf);
        System.out.println("cevap = " + cevap);
    }
}
