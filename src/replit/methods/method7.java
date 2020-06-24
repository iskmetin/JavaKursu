package replit.methods;

import java.util.Arrays;
import java.util.Scanner;


public class method7 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("sayi gir");
        String sayi=scn.nextLine();
        String[] dizisayi=sayi.split(" ");
        int[] dizint=new int[dizisayi.length];
        for(int i=0;i<dizisayi.length;i++){
            dizint[i]=Integer.valueOf(dizisayi[i]);

        }
        System.out.println(Arrays.toString(plusOne(dizint)));


    }

    public static int[] plusOne(int[] dizisayi) {

        for(int i=0;i<dizisayi.length;i++){
            if(i== dizisayi.length/2){
                dizisayi[i]=dizisayi[i]+1;

            }

        }
        return dizisayi;
    }

}

