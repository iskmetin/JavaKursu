package replit.ifElseStatementTurkce;

import java.util.Scanner;

public class ifStatement_3 {
    public static void main(String[] args) {
        /**
         str1 ve str2 isimli 2 tane String oluşturulmuştur.
         Eğer str1, str2'ye eşit ise "String 1 is equal to String 2" yazdırınız.
         Eğer str1, str2'ye eşit değil ise "String 1 is NOT equal to String 2" yazdırınız.
         */
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();

        String str2 = scan.nextLine();

        if (str1.equals(str2)) {
            System.out.println("String 1 is equal to String 2");
        }
        if (!str1.equals(str2)) {
            System.out.println("String 1 is NOT equal to String 2");
        }
    }
}
