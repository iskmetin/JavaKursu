package Gunler.Gun07;

public class StringLastIndexOf {
    public static void main(String[] args) {
        // String içinde aranan karakter(ler)in sondan itibaren ilk indexini varır
        // indexOf un sondan olan hali fakat index numaraları değişmez.

        String text = "Good";
        System.out.println("En sondaki o nun indexi = " + text.lastIndexOf("o"));
        System.out.println("ilk baştan o nun indexi = " + text.indexOf("o"));

        String text2 = "ankara";
        System.out.println("En sondaki a nun indexi = " + text2.lastIndexOf("a"));
        System.out.println("ilk baştan a nun indexi = " + text2.indexOf("a"));
    }
}
