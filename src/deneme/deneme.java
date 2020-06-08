package deneme;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);
        System.out.println(" bir string giriniz");
        String kelime = text.nextLine();

        if (kelime.contains("a")) {
            String ykelime = kelime.substring(kelime.indexOf("a")).toUpperCase();
            System.out.println(ykelime);
            System.out.println(kelime);
        } else
            System.out.println("a yoktur");
    }

}

