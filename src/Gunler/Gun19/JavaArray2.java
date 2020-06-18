package Gunler.Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArray2 {
    public static void main(String[] args) {
        // Kullanıcından alacağınız 5 adet meyve ismini bir diziye atadıktan
        // sonra, elma ismi geçen meyvelerini ekrana ayrı bir döngüde yazdırınız.

        Scanner oku=new Scanner(System.in);
        String[] dizi=new String[5]; // 5 tane ama , oda numarası 0,1,2,3,4

        for(int i=0;i<dizi.length;i++)
        {
            System.out.print("Meyve adı giriniz=");
            dizi[i]=oku.nextLine();
        }

        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

        for(int i=0;i<dizi.length;i++)
        {
            if (dizi[i].equalsIgnoreCase("elma")) // sadece elma olanlar
                System.out.println(dizi[i]);

            if (dizi[i].toLowerCase().contains("elma")) // yerelması gibi olanlarda
                System.out.println(dizi[i]);
        }

    }
}
