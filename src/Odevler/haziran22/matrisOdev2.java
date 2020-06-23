package Odevler.haziran22;

import java.util.Arrays;

public class matrisOdev2 {
    public static void main(String[] args) {
        //Günün Sorusu :  3x3 lük 2 matrisi random (0-9 arası) doldurup, çarpımını ekrana yan
        // yana yani 1.matris x 2.matris = sonuç matrisi şeklind eyazdırınız
        int dizi1[][] = new int[3][3];
        int dizi2[][] = new int[3][3];
        int yenidizi[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dizi2[i][j] = (int) (Math.random() * 10);
                dizi1[i][j] = (int) (Math.random() * 10);
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                yenidizi[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    yenidizi[i][j] += dizi1[i][k] * dizi2[k][j];
                }
            }

        }
        for (int i = 0; i < 3; i++) {
            if(i==1) {
                System.out.println(Arrays.toString(dizi1[i]) + "   X   " + Arrays.toString(dizi2[i]) + "    =   " + Arrays.toString(yenidizi[i]));
            }
            else{
                System.out.println(Arrays.toString(dizi1[i]) +"       " + Arrays.toString(dizi2[i])+"        "  + Arrays.toString(yenidizi[i]));
            }
        }

    }
}