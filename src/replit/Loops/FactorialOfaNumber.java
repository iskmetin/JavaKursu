package replit.Loops;

import java.util.Scanner;

public class FactorialOfaNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int useIntAsMax = scan.nextInt();

        int toplam =1;
        //code start here
        for(int a=useIntAsMax;a>0;a=a-1){

            toplam=toplam*a;

        }
        System.out.println(toplam);



    }
}
