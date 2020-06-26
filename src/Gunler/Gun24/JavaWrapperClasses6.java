package Gunler.Gun24;

public class JavaWrapperClasses6 {
    public static void main(String[] args) {
        // program sadece rakam veya harf gibi veya true false gibi,
        // basit değerler saklayacaksa hazfızada çok yer kaplamasın diye
        // aynı tiplerin basit yani primitive tilerini oluşturalım.
        // eğer bu değerlden fazlası gerekecekse ozaman bunların ilk harfi büyük
        // halleri olan tipleri kullanılsın

        int a=5;
        String strInt = String.valueOf(a); // bu ise basit sadece bir sayı

        Integer b=6;
        String strInteger = b.toString();   // yani bu tipin içinde gerekli çok ça metod var
        // içinde çokça metod olan tiplere Wrapper Class deniyor.
        // wrapper kaplamak demek methodlari kapladik icinde cok method var - Hülya tuna dedi

        b = a; // boxing denir, basit olan tipin , kapsamlı tipe atanmasına denir.
        a = b; // unboxing denir, yani kapsamlı tipin , basite atanmasına.

        double c=3.4;
        Double d=5.6;

        char e='F';
        Character f='Y';

        boolean g=true;
        Boolean h=false;

        float k=3.4f;
        Float l=5.6f;
    }
}
