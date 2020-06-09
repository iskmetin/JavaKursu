package Odevler.haziran08;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("x i giriniz");
        int x = oku.nextInt();
        System.out.println("y i giriniz");
        int y = oku.nextInt();

        if ((-2 < x && x < 8 && y == 1) || (-2 <= x && x <= 8 && y == 4) || (1 <= y && y <= 4 && x == -2) || (1 <= y && y <= 4 && x == 8)) {
            System.out.println("dikdortgensel bolgenin ustunde");
        } else if (-2 < x && x < 8 && y < 4 && y > 1) {
            System.out.println("dikdortgensel bolgenin icinde");
        } else {
            System.out.println("dikdortgensel bolgenin disinda");
        }
    }
}
