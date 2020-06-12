package Odevler.haziran11;

public class soru4 {
    public static void main(String[] args) {
        // 1-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız
        int a = 1;
        while (a <= 255) {
            char b = (char) a;
            System.out.println("degeri " + a + " olan char:" + b);
            a++;
        }
    }
}
