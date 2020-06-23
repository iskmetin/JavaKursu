package Burak.Arrays_forEach_split.forEach;

public class b_forEach {
    public static void main(String[] args) {

        //TODO  Integer Array'indeki elemanları for each döngüsüyle toplayınız.

        int[] SayiArrayi = { 5, 8, 35, 90, 12};
        int toplam = 0;

        for (int yeniSayi : SayiArrayi){
            toplam += yeniSayi;
        }

        System.out.println("Toplam = " + toplam);




    }
}
