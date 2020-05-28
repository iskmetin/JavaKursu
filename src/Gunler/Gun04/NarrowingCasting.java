package Gunler.Gun04;


public class NarrowingCasting {
    public static void main(String[] args) {

//        double -> float -> long -> int -> char -> short -> byte : manuel dönüşüm

        double vergi = 6.956;
        int yuvarlanmisVergi = (int)vergi;

        System.out.println("yuvarlanmisVergi = " + yuvarlanmisVergi);

    }
}
