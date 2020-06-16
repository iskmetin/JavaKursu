package Ömer._Odevler;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        /*
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.

        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!

        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.
        5. final notu double değerinde olmalı. (örn: 65,5)

        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.

        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.

        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.

                                        todo    Koşul kısmı

                                        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
                                                                        80(80dahil)   ile 90 arasında ise  BA,
                                                                        70(70 dahil)   ile 80 arasında ise BB,
                                                                        60(60dahil) ile 70 arasında ise CB,
                                                                        50(50 dahil) ile 60 arasında ise CC,
                                                                     40(40 dahil) ile 50 arasında ise DC,
                                                                     30(30 dahil) ile 40 arasında ise DD,
                                                                     30 'dan düşük ise FF            gelmeli.



         */

        System.out.print("Vize sınav sonucunuzu giriniz:    ");

        double vize = sc.nextDouble();


        System.out.print("Vize yüzdesini giriniz:   ");
        double vizeYuzde = sc.nextDouble();


        System.out.print("Final sınav sonucunu giriniz :   ");

        double finalNot = sc.nextDouble();


        System.out.print("Final yüzdesini giriniz :    ");

        double finalYuzde = sc.nextDouble();


        double VizeSonuc =vize * vizeYuzde;
        double finalSonuc = finalNot * finalYuzde;
        double dersNotuOrtalamasi = VizeSonuc + finalSonuc;



        if (dersNotuOrtalamasi>=90 && dersNotuOrtalamasi<=100){
            System.out.println("Harf notunuz : AA  " + "Not ortalamanız :  " + dersNotuOrtalamasi);
        }else if (dersNotuOrtalamasi>=80 && dersNotuOrtalamasi<90){
            System.out.println("Harf notunuz:  BA " + "Not ortalamanız   :" +dersNotuOrtalamasi);
        }else if (dersNotuOrtalamasi>=70 && dersNotuOrtalamasi<80){
            System.out.println("Harf notunuz:  BB " + "Not ortalamanız   :" +dersNotuOrtalamasi);
        }else if (dersNotuOrtalamasi>=60 && dersNotuOrtalamasi<70){
            System.out.println("Harf notunuz:  CB " + "Not ortalamanız   :" +dersNotuOrtalamasi);
        }else if (dersNotuOrtalamasi>=50 && dersNotuOrtalamasi<60){
            System.out.println("Harf notunuz:  CC " + "Not ortalamanız   :" +dersNotuOrtalamasi);
        }else if (dersNotuOrtalamasi>=40 && dersNotuOrtalamasi<50){
            System.out.println("Harf notunuz:  DC " + "Not ortalamanız   :" +dersNotuOrtalamasi);
        }else if (dersNotuOrtalamasi>=30 && dersNotuOrtalamasi<40){
            System.out.println("Ders notunuz:  DD " + "Not ortalamanız   :" + dersNotuOrtalamasi);
        }else
            System.out.println("Harf Notunuz: FF.  TEBRİKLER YAZ OKULUNA GİTMEYİ HAK KAZANDINIZ !!!" + "Not ortalamanız:   " +dersNotuOrtalamasi);


    }
}
