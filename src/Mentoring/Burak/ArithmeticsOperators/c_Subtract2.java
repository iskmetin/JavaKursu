package Burak.ArithmeticsOperators;

import java.util.Scanner;

public class c_Subtract2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        byte num2 = sc.nextByte();
        byte num3 = sc.nextByte();     //max byte: 127  min byte:-128

        System.out.println(num1 - num2 - num3);

    }
}
//TODO      1 adet INT, 2 adet de BYTE oluşturunuz. İnt'dan iki byte'ı çıkarınız. Sonucu yazdırınız.
//TODO      Scanner kullanınız.