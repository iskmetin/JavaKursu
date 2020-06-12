package Odevler.haziran11;

public class soru5 {
    public static void main(String[] args) {
        //5-Bir çalışanın başlangıç maaşı 2000 tl olsun.her yıl %15 zam yapılırsa, 5 yıl sonra çalışanın maaşı kaç lira olur.
        int ilkMaas=2000;
        int yil=0;
        while(yil<5){
            ilkMaas=(ilkMaas*15/100)+ilkMaas;
            yil++;
        }
        System.out.println("bes yil sonraki maas: "+ilkMaas);
    }
}
