package Tahir.ifElseWhile;

import java.util.Scanner;

public class miniProje {
    public static void main(String[] args) {

        /*
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Techno Study IT course");
        String operation = "1.Course Schedule\n"
                + "2.What you will learn.\n"
                + "3.Accountant\n"
                + "4.Course Registration\n"
                + "Press q for quit";
        System.out.println(operation);
        System.out.println("*************************************");


        while (true) {
            System.out.println("Choose operation");
            String step = scan.nextLine();

            if (step.equals("q")) {
                System.out.println("Exit");
                break;

            } else if (step.equals("1")) {

                String morning = "Official hours: Monday-Friday--> 10:00-13:00\n"
                        + "Mentoring hours:Saturday-Sunday-->10:00-13:00";
                System.out.println(morning);


            } else if (step.equals("2")) {
                //  kullanici 2 yi girince Techno Study kursunda ogrenilcek programlar yazdirilsin


            } else if (step.equals("3")) {
                // kullanici 3 girince once isim onaylansin. sonra isime ait 2 secenek verilsin.
                // ilk secenek boecunuz yoktur,
                // ikinci secenk borcunuz vardir , nasil odemek istersiniz?- pesin veya onlayn olarak iki secenek ciksin.
                // pesin ise lutfen kurs merkezimiz giriscimuhasebe odasina gidin tarzinda birsey yazdirin.
                // onlayn odeme ise mail adresini istesin ve odee bilgilerini emaile yollasin

            } else if (step.equals("4")) {
                // kursa  kayit icin while dongusu kullanin. iki secenek ciksin. onlayn ve ofistetarzinda
                // isim soyad istesin. sabahci ise sabah kurslarina kaydoldunuz, aksam ise aksam kursuna kaydoldunuz seklinde yazsin yazsin

            } else {

                System.out.println("Wrong operation");
            }

        }

    }
}
