package projeler.haziran12;
import java.util.Scanner;

public class days {

        /*
               Aşağıda verilen gün adlarına göre, Girilen bir gün numarasına karşılk gelen gün adını yazınız.

                Eger int 1 ise print monday
                Eger int 2 ise print tuesday
                Eger int 3 ise print wednesday
                Eger int 4 ise print thursday
                Eger int 5 ise print friday
                Eger int 6 ise print saturday
                Eger int 7 ise print sunday
                Eger int 8 den buyuk ise  print "this is not a valid day"

                NOT : BU PROBLEMI ÇÖZERKEN SWITCH STATEMENT KULLANIN
         */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();

        //  kodu burdan başlatın ve bu satırdan önceki kodlari degiştirmeyin
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("this is not a valid day");
                break;
        }

    }
}



