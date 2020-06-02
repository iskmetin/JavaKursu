package Gunler.Gun07;

public class StringSubstring {
    public static void main(String[] args) {
        // Substring : stringin belli bir bölümünü alma işlemi
        //012345
        String text = "Merhaba arkadaşlar";

        System.out.println("1.bölüm = " + text.substring(1, 5)); // 1 nolu indexten 5 e kadar 5 dahil değil
        System.out.println("2.bölüm = " + text.substring(0, 3)); // Mer
        System.out.println("3.bölüm = " + text.substring(4)); // verilen indexten itibaren sonuna kadar alır

        String strAlinan = text.substring(0, 3); // bu şekilde alınan parça atanabilir.
    }


}
