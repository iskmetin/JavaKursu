package Odevler.haziran13mentoring;

import java.util.Scanner;

public class NestedIfElse3_Menu_Projesi_COZUMU {

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
        Scanner oku=new Scanner(System.in);
        double toplamFiyat=0;
        int cuzdanim=100;
        System.out.println("ne alirsiniz?");
        System.out.println("1.Hamburger:  3 euro\n2.CheeseBurger:  4 euro\n3.Doner: 2.5 euro ");

        int secim=oku.nextInt();
         if(secim==1){
             toplamFiyat+=3;
             System.out.println("ekstra kofte ister misiniz?( +1 euro farkla   evet/hayir)");
             String bosLine = oku.nextLine();
             String ekstraSecim=oku.nextLine();
             if(ekstraSecim.equalsIgnoreCase("evet")){
                 toplamFiyat+=1;
                 System.out.println("2. kofte ekleniyor...");System.out.println("Cift kofteli hamburgeriniz hazirdir...");
             }else{
                 System.out.println("Hamburgeriniz hazirdir!");
             }
         }
        else if(secim==2){
            toplamFiyat+=4;
            System.out.println("ekstra peynir ister misiniz?( +0.50 euro farkla   evet/hayir)");
             String bosLine = oku.nextLine();
            String ekstraSecim=oku.nextLine();
            if(ekstraSecim.equalsIgnoreCase("evet")){
                toplamFiyat+=0.50;
                System.out.println("2. peynir ekleniyor...");
                System.out.println("Cift peynirli Cheese burgeriniz hazirdir...");
            }else{
                System.out.println("ekstra peynirsiz Cheese burgeriniz hazirdir!");
            }
        }
         else if(secim==3){
             toplamFiyat+=2.5;
             System.out.println("ekstra sos istermisiniz ?( \nbarbeku sos \naci sos");
             String ekstraSecim=oku.nextLine();
             if(ekstraSecim.equalsIgnoreCase("barbeku sos")){

                 System.out.println("Barbeku soslu doneriniz hazirdir");

             }else if(ekstraSecim.equalsIgnoreCase("aci sos")){
                 System.out.println("Aci soslu doneriniz hazirdir!");
             }
             else{
                 System.out.println("Sossuz doneriniz hazirdir!");
             }
         }
        System.out.println("Icecek ister misiniz?");
         String icecekSecim=oku.nextLine();

        if(icecekSecim.equalsIgnoreCase("evet")){
            toplamFiyat+=1.5;
            System.out.println("Normal yada Zero ?");
            String ekstraSecim=oku.nextLine();
            if(ekstraSecim.equalsIgnoreCase("Normal")){
                toplamFiyat+=1;
                System.out.println("Coca cola hazirlaniyor");

            }else{
                System.out.println("Coca cola zero hazirlaniyor");
            }
        }
        System.out.println("cuzdaninizda 100 euro var");
        System.out.println("toplam tutar: "+toplamFiyat);
        System.out.println("Para ustunuz: "+(cuzdanim-toplamFiyat));

    }
}
