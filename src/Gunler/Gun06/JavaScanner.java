package Gunler.Gun06;


import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {
        //int    sayi=0;  // bunu tanımladığımız gibi aşağıda tanımlıyoruz
        Scanner oku = new Scanner(System.in); // Klavyeeden veri girişi yapılacak

        System.out.print("Bir sayi giriniz=");
        int sayi = oku.nextInt(); // okuma işlemi burada kursör bekliyor
        System.out.println("sayi = " + sayi);

    }
}
