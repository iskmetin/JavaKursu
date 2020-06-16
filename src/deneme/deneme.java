package deneme;

import java.util.Scanner;


public class deneme {

    /*                      todo   Basit ATM projesi


        int bakiye belirleyin ve bakiyemizde başlangıçta 1000 tl olsun.
       todo ipucu : ->  para çekme ve yatırma işlemleri için de bir int create edin. Her işlemde arrtırın veya azaltın. (int islem)

        Sistem bize ilk olarak seçenekleri sunmalı. Örn:

        1.Bakiye görüntüle
        2.Para yatırma
        3.Para çekme
        4.Sistemden çıkış


        Switch - Case kullanarak  4 seçenekten birini seçtirin.

       1. Bakiye görüntüle derse, sistem toplam bakiyeyi yazdırsın.

       2.Para yatırma derse, "ne kadar yatırmak istiyorsunuz?" sorusu gelsin. Bir değer girilsin ve yeni  bakiye yazdırılsın.

       3.Para çekme derse, " ne kadar para çekmek istiyorsunuz?" sorusu geldin. Bir değer girilsin ve yeni bakiye yazdırılsın.

        4.Sistemden çıkış dediğinde " Sistemden çıkılıyor.." mesajını versin.

        5.Yanlış tuşlama yapıldığında "Geçersiz işlem" mesajını versin.
 */
    public static void main(String[] args) {


        Scanner oku = new Scanner(System.in);
        int bakiye = 1000;
        System.out.println("1.Bakiye görüntüle \n2.Para yatırma \n3.Para çekme \n4.Sistemden çıkış ");
        int islem = oku.nextInt();

        switch (islem) {
            case 1:
                System.out.println("hesabinizda " + bakiye + "tl para var");
                break;
            case 2:
                System.out.println("ne kadar yatırmak istiyorsunuz?");
                int arti = oku.nextInt();
                System.out.println("yeni bakiyeniz " + bakiye + arti);
                break;
            case 3:
                System.out.println("ne kadar cekmek istiyorsunuz?");
                int eksi = oku.nextInt();
                System.out.println("yeni bakiyeniz " + (bakiye - eksi));
                break;
            case 4:
                System.out.println("sistemden cikiliyor");
                break;
            default:
                System.out.println("gecersiz islem");
        }

    }

}



