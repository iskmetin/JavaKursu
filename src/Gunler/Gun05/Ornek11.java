package Gunler.Gun05;

public class Ornek11 {
    public static void main(String[] args) {
        // String olarak verilen Gece ve Gündüz hava sıcaklığı bilgisinin toplamını
        // yazdırınız.

        String geceStr = "10";
        String gunduzStr = "25";

        int geceDerece = Integer.parseInt(geceStr);
        int gunduzDerece = Integer.parseInt(gunduzStr);

        int toplamDerece = geceDerece + gunduzDerece;

        System.out.println("toplamDerece = " + toplamDerece);

    }

}
