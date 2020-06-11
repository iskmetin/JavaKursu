package Odevler.haziran10;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        //Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.println("bugun hangi gun?\npazartesi=1\nsali=2\ncarsamba=3\npersembe=4\ncuma=5\ncumartesi=6\npazar=7");
        int gun = oku.nextInt();

        switch ((gun + 100) % 7) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("hatali giris");
                break;

        }

    }
}
