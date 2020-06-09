package Gunler.Gun12;

import java.util.Scanner;

public class JavaRandom9 {
    public static void main(String[] args) {
        // Kullanıcıdan alt ve üst değeri isteyerek random sayı üretiniz
        // ve üretilen sayıyı ekrana yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Alt değer =");
        int min = oku.nextInt();

        System.out.print("Üst değer =");
        int max = oku.nextInt();

        int numberInRange = (int) (Math.random() * ((max - min) + 1)) + min;

        //3 7 arası üretmek istersek
        //max değer için bu = 0,1 * 5 => 0,5 + 3 = min 3
        //max değer için bu = 0,99 * 5 => 4,95 + 3 = max 7

        System.out.println("numberInRange = " + numberInRange);
    }
}
