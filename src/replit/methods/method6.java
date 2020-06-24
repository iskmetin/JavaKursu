package replit.methods;
import java.util.Scanner;
public class method6 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String sayi=scn.nextLine();
        System.out.println(EvenOddNums(sayi));

    }
    public static int EvenOddNums(String sayi) {
        int sum=0;
        char[] dizi=sayi.toCharArray();
        for(int a=0;a<dizi.length;a++){
            if(Character.getNumericValue(dizi[a])%2==1){
                sum=sum-Character.getNumericValue(dizi[a]);
            }
            else{
                sum=sum+Character.getNumericValue(dizi[a]);
            }
        }

        return sum;

    }

}
