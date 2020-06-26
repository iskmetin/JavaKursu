package Gunler.Gun23;


// Kullanıcı bir öğretmendir.
// Önce Öğrencinin adı girilecek, sonra aldığı farklı miktardaki notlar girilecek
// Ahmet Demir  bu okunduktan sonra
// 80 56 78 90  okutulacak ve öğrenci adı ve ortalaması yazılacak ekrana
// ortlama bulma işlemini bir fonksiyonda yapınız, fakat sonucu yazdırma işlemini
// mainde yaptırınız.Her öğrenci farklı sayıda not girilebilir.

import java.util.Scanner;

public class JavaMetod5 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Öğrencinin Adı Soyadı=");
        String isim=oku.nextLine();

        System.out.print("Öğrencinin notları=");
        String strNotlar=oku.nextLine(); // 60 40 70 80

        System.out.println("Öğrenci = " + isim);
        System.out.println("Ortalaması = " + ortalamaBul(strNotlar));
    }

    public static double ortalamaBul(String notlar)
    {
        double toplam=0;
        String[] notDizi=notlar.split(" ");

        for(int i=0;i<notDizi.length;i++)
        {
            toplam += Integer.parseInt(notDizi[i]);
        }

        return toplam/notDizi.length;
    }


}
