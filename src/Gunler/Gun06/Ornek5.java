package Gunler.Gun06;

import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {
        // Kullanıcıdan kaç bilet istediğini(byte) ve sigorta isteyip istemedğini (boolean olarak)
        // alıp ekrana yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Bilet istiyorsunuz=");
        byte biletSayisi = input.nextByte();

        System.out.print("Sigorta istiyor musunuz ? ");
        boolean isSigorta = input.nextBoolean();

        System.out.println("Bilet sayisi=" + biletSayisi + "\n Sigorta istiyor mu = " + isSigorta);
    }
}
