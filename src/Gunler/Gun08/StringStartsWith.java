package Gunler.Gun08;

public class StringStartsWith {
    public static void main(String[] args) {
        // StartsWith : Bir stringin verilen string ile başlayıp başlamadığını kontrol eder
        // ... ile başlıyor mu ?
        String text = "Merhaba Dünya";

        System.out.println("ME ile başlıyor Mu ? = " + text.startsWith("ME"));
        System.out.println("Me ile başlıyor Mu ? = " + text.startsWith("Me"));
        System.out.println("M ile başlıyor Mu ? = " + text.startsWith("M"));
        System.out.println("k ile başlıyor Mu ? = " + text.startsWith("k"));
        System.out.println("text = " + text);
    }
}
