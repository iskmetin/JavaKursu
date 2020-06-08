package Gunler.Gun11;

import java.util.Scanner;

public class ifelseLogic5 {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz=");
        String text = oku.nextLine();

        if (text.length() > 10 && text.contains("study")) {
            System.out.println("Evet");
        }
        else {
            System.out.println("Hayır");
        }
    }
}
