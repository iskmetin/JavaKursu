package Gunler.Gun17;

import java.util.Scanner;

public class GununSorusu2 {
    public static void main(String[] args) {
        //     içinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String okutunuz.
        //     okunan bu 3 string içindeki negaitf de olabilen sayıları toplatın.
        //     Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.

//        String num1 = "$15";
//        String num2 = "$-20";
//        String num3 = "$30";

        Scanner oku=new Scanner(System.in);
        System.out.print("1.Ücreti giriniz=");
        String strUcr1=oku.nextLine();

        System.out.print("2.Ücreti giriniz=");
        String strUcr2=oku.nextLine();

        System.out.print("3.Ücreti giriniz=");
        String strUcr3=oku.nextLine();

        int rakamUcr1= Integer.parseInt( strUcr1.replaceAll("[$A-Za-z]",""));
        int rakamUcr2= Integer.parseInt( strUcr2.replaceAll("[$A-Za-z]",""));
        int rakamUcr3= Integer.parseInt( strUcr3.replaceAll("[$A-Za-z]",""));

        int toplam = rakamUcr1+rakamUcr2+rakamUcr3;

        if (toplam > 0)
            System.out.println(toplam);
        else
            System.out.println(-1);

       // System.out.println(  toplam > 0 ? toplam : -1 );
    }
}
