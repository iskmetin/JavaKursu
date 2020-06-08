package Odevler.haziran04;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        // 7- Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bulunuz.
        Scanner tara = new Scanner(System.in);
        System.out.println("vize notunuzu girin");
        int vize = tara.nextInt();
        System.out.println("final notunuzu girin");
        int finalnotu = tara.nextInt();
        double ortalama = (vize * 0.4) + (finalnotu * 0.6);
        System.out.println("ortalama=" + ortalama);

    }

}
