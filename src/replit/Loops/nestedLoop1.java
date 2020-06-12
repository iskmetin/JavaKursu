package replit.Loops;

import java.util.Scanner;

public class nestedLoop1 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("istediginiz uzunlugu giriniz:");
        int height = oku.nextInt();
        System.out.println("istediginizgenisligi giriniz:");
        int length = oku.nextInt();
        int uzunluk = height;
        int en = length;
        while (uzunluk > 0) {
            en = length;
            while (en > 0) {
                System.out.print("#");
                en--;
            }
            System.out.println("");
            uzunluk--;
        }
    }
}