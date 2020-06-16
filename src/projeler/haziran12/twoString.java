package projeler.haziran12;
import java.util.Scanner;

public class twoString {

    public static void main(String[] args) {

        /*
        Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle.

        Eger ilk kelimenin son harfi, ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın

        Örnek:      "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
         */
        Scanner dp = new Scanner(System.in);

        String allElements = dp.nextLine();

        String[] elements = allElements.split(" ");

        String s1 = elements[0];

        String s2 = elements[1];

        // code start here use s1 and s2 as words
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        char a = 0;
        for (char output : char1) {
            System.out.print(output);
            a = output;
        }
        if (char2[0] != a) {
            for (int i = 0; i < char2.length; i++)
                System.out.print(char2[i]);
        } else {
            for (int i = 1; i < char2.length; i++)
                System.out.print(char2[i]);
        }
    }
}
