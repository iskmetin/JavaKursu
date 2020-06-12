package Gunler.Gun14;


import java.util.Scanner;

public class DoWhile9 {
    public static void main(String[] args) {
        // Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner oku=new Scanner(System.in);
        String okunan="";

        do {
            okunan = oku.nextLine();
             if (okunan.equalsIgnoreCase("x")) break; // break : döngü kırıcı

            System.out.println("Program çalışıyor");
        }while(!okunan.equalsIgnoreCase("x"));

        System.out.println("Program bitti.");
    }
}
