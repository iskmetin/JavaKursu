package projeler.haziran12;
import java.util.Random;
import java.util.Scanner;

public class RandomNum {
     /*

    Kullanıcıdan pozitif bir sayı alınız ve
    0 ile girilen sayı arasında Random int tipinde bir sayı üreten programı yazınız.

    not : girilen sayı üretilen sayılara dahil olmalı

  */
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("bir sayi giriniz");
         int max = scanner.nextInt();

         int random = (int) (Math.random() * (max + 1));
         System.out.println(random);

     }


}
