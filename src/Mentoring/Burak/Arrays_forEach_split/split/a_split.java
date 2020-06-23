package Burak.Arrays_forEach_split.split;

import java.util.Scanner;

public class a_split {
    public static void main(String[] args) {

        //todo Bir Scanner oluşturup bir atasözü giriniz. Girdiğiniz atasözünde her " " (Boşluk) da split methodu uygulansın.

        Scanner sc = new Scanner(System.in);

        System.out.println("Bir atasözü giriniz: ");

        String atasozu = sc.nextLine();

        String[] kelime = atasozu.split("l");  //İstediğimiz şeyi girebiliriz. O yazdığımız şeyi görürse split methodunu uygular.

        for (String eleman : kelime){
            System.out.println(eleman);
        }

    }
}
