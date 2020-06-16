package Ömer.a_Switch_Case_Mentoring_2;

import java.util.Scanner;

public class NestedIfElse3_Menu_Projesi {

    public static void main(String[] args) {

   /*
        Büfeden sipariş vereceksiniz.
        Double cuzdanim  oluşturun ve içerisinde 20 euro para olsun.
        Ve double toplamTutar oluşturun, her işlem sonrası artsın. (her siparişten sonra belirtilen fiyatı toplamtutara ekleyin!!

        ilk olarak konsolda;
        1.Hamburger : 3 Euro
        2.CheeseBurger: 4 Euro
        3.Döner : 2.5 Euro

        yazsın.   Kullanıcı int değeri girerek seçeneklerden birini seçsin.

                todo Eğer 1'i seçerse,
          (toplamTutara hamburgerin fiyatını eklemeyi unutmayın!!)
        Sistem bize "Ekstra Köfte İster misiniz ? (+1 Euro fark ile) :   (büyük küçük harf duyarlı olmaması için method kullanın)

        evet derse "2. köfte ekleniyor" mesajı gelsin.Altında da "Çift köfteli hamburgeriniz hazır !" yazsın.

        Hayır derse "Hamburgeriniz hazırdır !" yazsın.

        todo Eğer 2 yi seçerse,

         Sistem bize "Ekstra peynir ister misiniz? (+ 0,50 cent fark ile)  sorusunu sorsun.

         Evet derse, "2. peynir ekleniyor" mesajı, ve altına da "Çift peynirli Cheeseburgeriniz hazır! yazsın.

         Hayır derse, " ekstra peynirsiniz CheeseBurgeriniz hazır !"    yazsın.

        todo Eğer 3 'ü seçerse,

        Ekstra Sos ister misiniz ? (Barbekü sos ve Acı sos) :     sorusunu sorsun.
        evet


        Eğer Barbekü sos seçilirse "Barbekü soslu döneriniz hazır ! ",
        Eğer Acı sos seçilirse "Acı soslu döneriniz hazır !

        hayır derse,
     Döneriniz sossuz hazırlanıyor..


todo    İçecek ister misiniz ? (Mevcut içeceğimiz: Coca Cola = 1,5 Euro)

Eğer evet derse, "Normal ya da Zero ?  (normal veya zero olarak cevaplayınız ): "  sorusunu sorsun.

 Eğer normal derse, Coca Cola hazırlanıyor..
 Eğer  zero derse, Coca Cola Zero hazırlanıyor.


 Bu aşamaya kadar hep harcalamalar yaptık.
 Her harcama yaptıgımızda double toplamTutar'a bunu eklememiz gerekiyor.

 Önce cüzdanımı görmek istiyorum. (cüzdanım = 100 euro)
 Toplam tutarı yazdırın.. (45 euro )
 double paraUstu oluşturun ve paraüstünü yazdırın. (para üstü = 55 euro)



 -TODO İPUCU -  Dummy kod eklemeniz gereken yerleri tespit edin ve boş Line ekleyin. (String bosLine = sc.nextLine();)

                 */


        Scanner sc = new Scanner(System.in);

        double cuzdanim = 20.0;
        double toplamTutar= 0.0;

        String evetHayir ;

        System.out.println("1.Hamburger : 3 Euro " + "\n" + "2.CheeseBurger : 4 Euro  " + "\n" + "3.Döner : 2.50 Euro");



        int secim = sc.nextInt();

        if (secim==1){

            toplamTutar+=3; //Hamburgerin fiyatı toplamtutara eklendi.


            sc.nextLine();

            System.out.print("Ekstra köfte istiyor musunuz ?(+1 euro fark ile)- >>>   ");
        evetHayir = sc.nextLine();
            if (evetHayir.equalsIgnoreCase("evet")){
                toplamTutar +=1;

                System.out.println("2. Köfte ekleniyor...");
                System.out.println("Çift köfteli  hamburgerimiz hazırdır !!");

            }else if(evetHayir.equalsIgnoreCase("Hayır"))
                System.out.println("Hamburgeriniz hazırlanıyor...");

        }

        if (secim==2){
                toplamTutar+=4;

                sc.nextLine(); //dummy kod (boskod)

            System.out.print("Ekstra peynir ister misiniz ? (0,50 cent fark ile) -->>>");
            evetHayir=sc.nextLine();
            if (evetHayir.equalsIgnoreCase("evet")) {
                toplamTutar += 0.50;

                System.out.println("2. peynir hazırlanıyor..");
                System.out.println("Çift peynirli CheeseBurgeriniz hazırdır !!");


            }else if (evetHayir.equalsIgnoreCase("hayır"))
                System.out.println("Cheeseburgeriniz hazır!!");
        }

        if (secim==3) {

            toplamTutar += 2.5;
            sc.nextLine(); //dummy kod (boskod)

            System.out.print("Ekstra sos ister misiniz? (+0,50 cent fark ile -- Barbekü sos ve acı sos mevcuttur!) -->>");
            evetHayir = sc.nextLine();


            if (evetHayir.equalsIgnoreCase("evet")) {

                toplamTutar += 0.50;

                System.out.print("Acı sos veya barbekü sos ?:       ");
                String sos = sc.nextLine();


                if (sos.equalsIgnoreCase("barbekü sos")) {
                    System.out.println(sos + "unuz ekleniyor....");

                } else if (sos.equalsIgnoreCase("acı sos"))
                    System.out.println(sos + "unuz ekleniyor...");
            } else if (evetHayir.equalsIgnoreCase("hayır")) {

                System.out.println("döneriniz sossuz hazırlanıyor...");
            }
        }


            System.out.print("İçecek ister misiniz ? (Mevcut içecekler: Coca Cola : 1,5 euro");

            evetHayir = sc.nextLine();

            if (evetHayir.equalsIgnoreCase("evet")) {
                toplamTutar += 1.50;

                System.out.print("Zero mu  ? normal mi ? (Normal veya zero olarak cevaplandırınız:    ");

                String colaSecenek = sc.nextLine();

                if (colaSecenek.equalsIgnoreCase("zero")) {
                    System.out.println("Coca Cola Zero hazırlanıyor...");

                } else if (colaSecenek.equalsIgnoreCase("normal"))
                    System.out.println("Coca cola hazırlanıyor...");

            } else if (evetHayir.equalsIgnoreCase("hayır"))
                System.out.println("içecek seçilmedi..");



        System.out.println("Cüzdanım :  "+ cuzdanim);

        System.out.println("Toplam tutar:  " + toplamTutar);

        double paraUstu = cuzdanim -toplamTutar;

        System.out.println("Para üstünüz:  " + paraUstu);

















    }
}
