package Gunler.Gun05;

public class Ornek9 {
    public static void main(String[] args) {
        // String olarak verilen karenin 1 kenar uzunluğundan
        // karenin çevresinin uzunluğunu bulunuz.

        String kenarUzunlugu = "5";

        int kenarInt= Integer.parseInt(kenarUzunlugu);

        int Cevre = kenarInt + kenarInt + kenarInt + kenarInt;

        System.out.println("Cevre = " + Cevre);


    }
}
