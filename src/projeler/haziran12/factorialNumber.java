package projeler.haziran12;
import java.util.Scanner;

public class factorialNumber {

    public static void main(String[] args) {

        /*
        Girilen bir sayının faktöriyel değerini bulmak için bir program yazın.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720

         */


        //      kodu burdan başlatın
        Scanner oku = new Scanner(System.in);


        int number = oku.nextInt();
        int sum = 1;
        while (number>0) {
            sum = sum * number;
            number--;
        }
        System.out.print(sum);

    }
}
