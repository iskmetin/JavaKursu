package Gunler.Gun12;

import java.util.Scanner;

public class gununSorusu1 {
    public static void main(String[] args) {
        // Ben bu dersleri neden alıyorum ?
        // Günün sorusu 1

        Scanner oku = new Scanner(System.in);
        System.out.print("x değeri =");
        int x = oku.nextInt();

        System.out.println("y değeri =");
        int y = oku.nextInt();

        if (x > 0 && y > 0)
            System.out.println("A bölgesinde");
        else if (x < 0 && y < 0)
            System.out.println("C bölgesinde");
        else if (x < 0 && y > 0)
            System.out.println("B bölgesinde");
        else if (x > 0 && y < 0)
            System.out.println("D bölgesinde");
        else
            System.out.println("Eksen üzerinde");
    }
}
