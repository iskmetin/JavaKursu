package Odevler.haziran13mentoring;

import java.util.Scanner;

public class Switch3_Seyahat_ProjesiCOZUM {
    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz. İşlemlerde direkt bunları cağırabilirsiniz.



        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.


      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.









         */
        Scanner oku = new Scanner(System.in);

        System.out.println("Nereye yolculuk etmek istiyorsunuz? \nFrankfurt : 60 KM \nKöln : 80 KM \n(20 KM başına 5 euro bilet parası alınmaktadir..)");


        double fiyat = 0;

        String durak = oku.nextLine();
        switch (durak.toUpperCase()) {
            case "FRANKFURT":
                System.out.print("Rotaniz= " + durak + " ");
                System.out.println("ucret: " + (60 / 20) * 5);
                fiyat = +(60 / 20) * 5;
                break;
            case "KOLN":
                System.out.print("Rotaniz= " + durak + " ");
                System.out.println("ucret: " + (80 / 20) * 5);
                fiyat = +(80 / 20) * 5;
                break;
        }
        System.out.println("Kac kisilik bilet istiyorsunuz?(sayi giriniz)(max 2 kisi olabilir)");
        int biletAdet = oku.nextInt();

        switch (biletAdet) {
            case 1:
                System.out.println("Bir kisilik biletiniz hazir. ucret: " + fiyat);

                break;
            case 2:
                fiyat*=2;
                System.out.println("Iki kisilik biletiniz hazir. ucret: " + fiyat );
                break;
        }
        System.out.println("Bakiyeniz: 100TL\nToplam Tutar:"+fiyat+"\nPara Ustunuz:"+(100-fiyat));


    }
}
