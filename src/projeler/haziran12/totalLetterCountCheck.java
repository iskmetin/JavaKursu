package projeler.haziran12;
import java.util.Scanner;

public class totalLetterCountCheck {

    /*
      Girilen bir string teki harf sayısı tek ise true , değilse false yazdırınız.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        // kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin
        int count = 0;
        int sayac = 0;
        while (sayac < word.length()) {
            if (Character.isLetter(word.charAt(sayac)))
                count++;
            sayac++;
        }
        System.out.println(count % 2 == 1);
    }
}

