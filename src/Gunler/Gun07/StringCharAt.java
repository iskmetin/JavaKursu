package Gunler.Gun07;

public class StringCharAt {
    public static void main(String[] args) {
        // İstenen noktadaki karakteri verir,
        // karakterlerin sırası 0 dan başlar, buna index denir.
        // 0123456789012
        String kelime = "Merhaba Dünya";

        char harf = kelime.charAt(3);
        System.out.println("3.harf = " + harf); // 3 -> h

        harf = kelime.charAt(0);
        System.out.println("0.harf = " + harf); // 0 -> m
    }
}
