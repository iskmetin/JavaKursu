package Gunler.Gun05;

public class Ornek7 {
    public static void main(String[] args) {
        // Soru : Short olarak atadığınız değeri stringe çevirerek,
        // ekrana yazdırınız.

        short sayi = 345;
        String kelimeHali = Short.toString(sayi);

        System.out.println("kelimeHali = " + kelimeHali);

        int sayi2 = 245;   // sayı değeri taşır matematiksel işleme girer
        String kelimeHali2 = "245";  // sayı değeri taşımaz sadece sembol

        int top = 34 + sayi2;
        // int top2 = 34 + kelimeHali2; // bu şekilde kullanılamaz

    }
}
