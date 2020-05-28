package replit.datatypes;

import java.util.Scanner;

public class Scanner_1 {
    public static void main(String[] args) {
        //Kodu aşağıya  yazınız.
        Scanner myObj = new Scanner(System.in);
        System.out.println("Isminizi giriniz");
        String name = myObj.nextLine();


        System.out.println(name);

    }
}
