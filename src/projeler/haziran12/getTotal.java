package projeler.haziran12;
import java.util.Scanner;

public class getTotal<sum> {

     /*
     içinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String okutunuz.
     okunan bu 3 string içindeki negaitf de olabilen sayıları toplatın.
     Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.

         Ornek:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output ----> 65; olmali

        String num1 = "$15";
        String num2 = "$-80";
        String num3 = "$30";
        output ----> -1; olmali
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String allElements = scanner.nextLine();

        String[] elements = allElements.split(" ");

        String num1 = elements[0];

        String num2 = elements[1];

        String num3 = elements[2];

        //  code Start here don't change before this line
        //   use Strings num1 , num2 , num3

        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = elements[i].replace("$", "");

            sum = sum + Integer.parseInt(elements[i]);

        }
        if (sum >= 0) {
            System.out.print(sum);
        } else {
            System.out.print(-1);
        }
    }
}