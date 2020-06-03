package Gunler.Gun08;

public class StringReplace {
    public static void main(String[] args) {
        // Replace : bir stringin içerisindeki istenen karakter(leri)n hepsini,
        // verilen yenisi ile değiştirir.

        String text = "Merhaba Dünya";

        System.out.println("orjinal hali = " + text);
        System.out.println("a ların e olarak değiştirilmiş hali = " + text.replace('a', 'e'));
        System.out.println("ba -> de hali = " + text.replace("ba", "de"));
        System.out.println("Dünya-> Java değiştirilmiş hali = " + text.replace("Dünya", "Java"));
    }
}
