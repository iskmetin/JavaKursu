package Gunler.Gun06;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        // Kullanıcıdan boy(ondalıklı) ve kilosunu(ondalıklı) bilgisini
        // alıp ekrana tek satırda yazdırınız.

        Scanner ekrandanAl = new Scanner(System.in);

        System.out.print("Boyunuz = ");
        double boy = ekrandanAl.nextDouble();

        System.out.print("Kilonuz = ");
        double kilo = ekrandanAl.nextDouble();

        System.out.println("Boy =" + boy + "\n   kilo=" + kilo);

    }
}
