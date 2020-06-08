package Odevler.haziran08;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("x i giriniz");
        int x = oku.nextInt();
        System.out.println("y i giriniz");
        int y = oku.nextInt();

        if (x == 0 || y == 0) {
            System.out.println("y ekseni ustunde");

            if (y == 0 & x != 0) {
                System.out.println("x ekseni ustunde");
            } else if (x == 0 & y != 0) {
                System.out.println("y ekseni ustunde");
            } else
                System.out.println("orijinde");
        } else if (x < 0) {
            if (y < 0) {
                System.out.println("C bolgedesinde");
            } else if (y > 0) {
                System.out.println("B bolgedesinde");
            }
        } else if (x > 0) {
            if (y < 0) {
                System.out.println("D bolgedesinde");
            } else if (y > 0) {
                System.out.println("A bolgedesinde");
            }
        }
    }
}
