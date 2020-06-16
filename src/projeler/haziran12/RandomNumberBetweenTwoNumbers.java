package projeler.haziran12;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberBetweenTwoNumbers {

    /*
     Girilen 2 sayı arasında Random integer sayı üreten programı yazınız.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();

        String[] elements = s1.split(" ");

        int min = Integer.parseInt(elements[0]);
        int max = Integer.parseInt(elements[1]);


        Random random = new Random();
        int randomNumber = random.nextInt(max - min) + min;
        System.out.print(Integer.valueOf(randomNumber));



    }
}
