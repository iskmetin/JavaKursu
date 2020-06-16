package projeler.haziran12;
import java.util.Scanner;

public class printEvenNumbers {

    /*
    Girilen bir sayıya kadar olan çift sayıları  (0 ve girilen sayı dahil) yazdırınız.

    Example 1:
    int input = 10;

    print  0 2 4 6 8 10  olmalı


    Example 2:
    int input = 15;

    print  0 2 4 6 8 10 12 14  olmalı
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxNum = scanner.nextInt();

        // kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin
        for(int i=0;i<=maxNum;i=i+2){
            System.out.print(i+" ");
        }

    }

}
