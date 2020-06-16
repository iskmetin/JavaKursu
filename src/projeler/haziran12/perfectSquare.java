package projeler.haziran12;
import java.util.Scanner;

public class perfectSquare {
    /*
       Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
       tamkare ise true  değilse false yazdırınız.

        Not: sqrt gibi fonksiyonları  kullanmayın.

        Example 1:
        Input: 16
        Output: true
        Not: bu sayı tamkare çünkü 4*4 = 16

        Example 2:
        Input: 25
        Output: true
        Note: bu sayı tamkare çünkü 5*5=25


        Example 3:
        Input: 14
        Output: false

     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        // kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin
        boolean a = false;
        int i=1;
        while ( i * i <= input) {

            // If (i * i = n)
            if ((input % i == 0) && (input / i == i)) {
                a =true;

            } else {
                a =false;
            }
            i++;
        }
        System.out.print(a);

    }
}
