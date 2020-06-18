package replit.arrays;

import java.util.Arrays;

public class ArrayBothEnds {
    public static void main(String[] args) {
        int[] dizi={1,2,3,4};
        int [] yenidizi = new int[2];

        for(int i=0;i<dizi.length;i++){
            if(i==0){
                yenidizi[i]=dizi[i];
            }
            else if(dizi.length-i==1){
                yenidizi[1]=dizi[i];
            }
        }
        System.out.print(Arrays.toString(yenidizi));
    }
}

