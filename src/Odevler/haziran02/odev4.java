package Odevler.haziran02;

import java.util.Scanner;

public class odev4 {
    public static void main(String[] args) {
        // bir stringin boş olup olmadığını kontrol ediniz
        Scanner tara=new Scanner(System.in);
        System.out.println(" bir sey yazin");
        String s1=tara.nextLine();
        System.out.println("stringin içi boş mu = " + s1.isEmpty());

    }
}
