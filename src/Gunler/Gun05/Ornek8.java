package Gunler.Gun05;

public class Ornek8 {
    public static void main(String[] args) {
        // String den sayıya dönüştürme
        String ekrandanGelen1 = "500";   // 1.bağış
        String ekrandanGelen2 = "1000";   // 2.bağış

        //int toplamBagis = ekrandanGelen1 +ekrandanGelen2;
        // bu şekilde olmaz çünkü rakam gibi gözüken semboller , sayı değil

        int bagis1 = Integer.parseInt(ekrandanGelen1); // artık sayısal degere döndü
        int bagis2 = Integer.parseInt(ekrandanGelen2); // artık sayısal degere döndü

        int toplamBagis = bagis1 + bagis2 ; // evet artık sayı haline dönüştürülünce, toplanabildi

        System.out.println("toplamBagis = " + toplamBagis);
    }
}
