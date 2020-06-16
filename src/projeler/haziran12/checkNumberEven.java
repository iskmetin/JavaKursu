package projeler.haziran12;

import java.util.Scanner;

public class checkNumberEven {

     /*
        Girilen bir sayı çift ise "true" , tek ise "false" yazdırınız
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // Kodu burdan baslatin ve bu satırdan önceki kodlari değiştirmeyin
        System.out.print(number%2==0);
    }

}
