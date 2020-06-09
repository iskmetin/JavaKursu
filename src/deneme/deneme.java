package deneme;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen X koordinati giriniz.: ");
        int xkoordinat = oku.nextInt();
        System.out.print("Lütfen Y koordinati giriniz.: ");
        int ykoordinat = oku.nextInt();

        if ((xkoordinat >= 0 && ykoordinat > 0) || (xkoordinat > 0 && ykoordinat >= 0)) {
            System.out.println("1. Bölgede");
        } else if ((xkoordinat >= 0 && ykoordinat < 0) || (xkoordinat > 0 && ykoordinat <= 0)) {
            System.out.println("2. Bölgede");
        } else if ((xkoordinat <= 0 && ykoordinat < 0) || (xkoordinat < 0 && ykoordinat <= 0)) {
            System.out.println("3. Bölgede");
        } else if ((xkoordinat <= 0 && ykoordinat > 0) || (xkoordinat < 0 && ykoordinat >= 0))
            System.out.println("4. Bölgede");
        else System.out.println("Orjinde");
    }
}
