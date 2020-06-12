package Gunler.Gun14;

import java.util.Scanner;

public class doWhile8 {
    public static void main(String[] args) {
        // Kullanıcıdan Sıfır girilene sayı isteyiniz.
        // bu soruyu önce while ile çözünüz.Sonra do-While

        Scanner oku=new Scanner(System.in);
        int sayi;

//        System.out.print("Sayı giriniz= ");
//        int sayi = oku.nextInt();
//
//        while(sayi != 0) {
//            System.out.print("Sayı giriniz= ");
//            sayi = oku.nextInt();
//        }

        // burada döngü içine mutlaka ilk kez girilir, işlemler yaılır, sonra döngü şartı
        // geçerli ise döngü dönmeye başlar.
          do{
              System.out.print("Sayı giriniz= ");
              sayi = oku.nextInt();
          }while(sayi !=0);
    }
}
