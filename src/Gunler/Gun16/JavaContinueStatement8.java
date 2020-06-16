package Gunler.Gun16;
import java.util.Scanner;

public class JavaContinueStatement8 {
    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

        Scanner oku=new Scanner(System.in);

        int toplam=0;
        for(int i=1;i<=5 ;i++) {

            System.out.print("Bir sayı giriniz = ");
            int sayi=oku.nextInt();

            if (sayi > 5 && sayi < 10) {
                System.out.println("Girdiğiniz sayı 5 ile 10 arasında olduğundan toplanmayacak");
                continue;
            }
            toplam +=sayi;  // toplam=toplam+sayi;
        }
        System.out.println("toplam = " + toplam);
        


    }
}
