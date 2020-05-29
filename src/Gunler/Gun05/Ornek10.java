package Gunler.Gun05;

public class Ornek10 {
    public static void main(String[] args) {
        // String olarak verilen true veya false degerini, boolean türüne
        // çevirerek yazdırınız.

         String cevapEvet = "true";
         String cevapHayir = "false";

         Boolean cevapE = Boolean.parseBoolean(cevapEvet);
         Boolean cevapH = Boolean.parseBoolean(cevapHayir);

        System.out.println("cevaplarınız = " + cevapE +" - "+ cevapH);


    }
}
