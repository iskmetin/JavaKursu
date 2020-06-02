package Gunler.Gun07;

public class StringEquals {
    public static void main(String[] args) {
        // 2 stringin birebir eşit olup olmadığını kontl eder,
        // sonuç boolean değişkenidir.büyük küçük harf farkı vardır.

        String str = "Merhaba";
        boolean birebirEsitMi = str.equals("Merhaba");

        System.out.println("birebirEsitMi = " + birebirEsitMi);

        System.out.println("birebirEsitMi = " + str.equals("merhaba"));
    }
}
