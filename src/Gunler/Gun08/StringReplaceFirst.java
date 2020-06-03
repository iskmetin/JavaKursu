package Gunler.Gun08;
public class StringReplaceFirst {
    public static void main(String[] args) {
        // ReplaceFirst  -> Replace ile aynı sadece ilk bulunanı değiştirir
        String text = "Merhaba Dünya";

        System.out.println("orjinal hali = " + text);
        System.out.println("bütün a ların nın değiştiği hali = " + text.replace("a","e"));
        System.out.println("ilk bulunan a nın değiştiği hali = " + text.replaceFirst("a","e"));
    }
}
