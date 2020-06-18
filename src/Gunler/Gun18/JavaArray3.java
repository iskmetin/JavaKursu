package Gun18;

import java.util.Scanner;

public class JavaArray3 {
    public static void main(String[] args) {
        // 5 elemanlı int bir dizi tanımlayınız.Kullanıcıdan değerleri alarak
        // bu diziyi doldurunuz.Daha sonra ortalamadan büyük eleman sayısını bulunuz.

        int[] dizi=new int[5]; // 0,1,2,3,4

        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for(int i=0; i<dizi.length;i++) // i nin değeri 0,1,2,3,4
        {
            System.out.print("Sayı giriniz=");
            dizi[i]= oku.nextInt();
            toplam+=dizi[i];
        }

        int ort = toplam / dizi.length;

        int ortGecenMik=0;
        for(int i=0; i<dizi.length;i++)
        {
            if (dizi[i]> ort)
                ortGecenMik++;
        }

        System.out.println("ortGecenMik = " + ortGecenMik);
    }
}
