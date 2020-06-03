package Gunler.Gun08;

public class StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll :  replace gibi çalışır ,farkı kritere göre değiştirir

        String text = "Merhaba Dünya";

        System.out.println("Orjinal hali = " + text);
        System.out.println(" a,b,n leri  _ yapılmış hali=" + text.replaceAll("[abn]", "_"));
        System.out.println(" Büyük harfleri  _ yapılmış hali=" + text.replaceAll("[A-Z]", "_"));
        System.out.println(" harflerin x yapılmış hali=" +
                text.replaceAll("[A-Z]", "x").replaceAll("[a-z]", "x"));
    }
}
