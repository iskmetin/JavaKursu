package replit.methods;

import java.util.Arrays;
import java.util.Scanner;

public class method11 {

    /*addDigits isminde bir method oluşturun.Parametresi int
Return tipi de int
pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
Tek basamaklı çıktığında, döndürün
Örnek1:
    Girdi 38
    Çıktı: 2
    Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
            2 , tek basamaklı olduğundan, bunu döndürün.*/
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.println("Bir sayi gir");
        int t = oku.nextInt();

        System.out.println(addDigits(t));
    }

    public static int addDigits(int t) {
        int sum=t;
        do{
            char[] tYazi=(Integer.toString(sum)).toCharArray();
            sum=0;
            for(int i=0;i< tYazi.length;i++){
                sum=sum+Integer.parseInt(String.valueOf(tYazi[i]));
            }

        }while((sum)>=10);

        return sum;
    }
}