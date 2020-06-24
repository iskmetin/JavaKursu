package Gun22;

import java.util.Scanner;

public class JavaMethod6 {
    public static void main(String[] args) {
     // Kullanıcıdan 2 sayı isteyiniz, toplamını bir methodda yaptırınız, sonucu mainde yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.print("1.Sayı =");
        int sayi1=oku.nextInt();

        System.out.print("2.Sayı =");
        int sayi2=oku.nextInt();

        int sonuc = toplamYaz(sayi1,sayi2);
        System.out.println("sonuc = " + sonuc);

        int enb = enBuyuk(sayi1,sayi2); // int enb= Math.max(3,4);  bunun gibi
        System.out.println("enb = " + enb);
    }
      // void : geriye bir şey göndermeyen yani return olmayan demek
    public static int toplamYaz(int s1, int s2) // fonksiyondaki değişkenler gönderilen değişkenlerle
            // aynı isimde olmak zorunda değil, sırasına göre bire bir eşleşiyor.
    {
        int toplam= s1+s2;
        
        return toplam;
    }

    public static int enBuyuk(int s1,int s2)
    {
        if (s1 > s2)
            return s1;
        else
            return s2;
        // return Math.max(s1,s2);
    }
}
