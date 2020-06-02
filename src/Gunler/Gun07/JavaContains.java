package Gunler.Gun07;

public class JavaContains {
    public static void main(String[] args) {
        // bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.
        // sonucu boolean değişkeni olarak döndürür

        String str = "Hello";
        boolean varMi = str.contains("llo"); // alternatif atanabiliyor bool değişkenine
        System.out.println("llo var mı = " + str.contains("llo"));
        System.out.println("o var mı = " + str.contains("o"));
        System.out.println("k var mı = " + str.contains("k"));
        System.out.println("O var mı = " + str.contains("O"));
    }
}
