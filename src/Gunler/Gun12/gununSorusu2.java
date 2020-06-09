package Gunler.Gun12;

import java.util.Scanner;

public class gununSorusu2 {
    public static void main(String[] args) {
        // Ben bu dersleri neden alıyorum ?
        // Günün sorusu 2

        Scanner oku = new Scanner(System.in);
        System.out.print("x değeri =");
        int x = oku.nextInt();

        System.out.print("y değeri =");
        int y = oku.nextInt();

        if (x < -2 || x > 8 || y > 4 || y < 1)
            System.out.println("Dışında");
        else if (y < 4 && y > 1 && x < 8 && x > -2)
            System.out.println("içinde");
        else
            System.out.println("Çizgi üzerinde");

        //çizgiüzerindekini yazmamaız gerekseydi
        // if (  ((x==8 || x== -2) && (y > 1 || y < 4) )      // sol ve sağ kenar
        //   || ((y==1 || y == 4) && (x> -2 || x < 8) )      // üst ve alt çizgi
        //

    }
}
