package Gunler.Gun21;

public class JavaMat1 {
    public static void main(String[] args) {
        int sayi=0;  // bu hafızada bir tane sayı yeri ayırır.
        int[] dizi=new int[5]; // bu hafızada 5 tane (0,1,2,3,4 indisli) int yeri ayırır
        int[][] mat=new int[4][5]; // bu hafızada 20 tane ama 4 satır, 5 sütun şeklinde int ayırır

        // 1.satır için
        mat[0][0]= 65;
        mat[0][1]= 85;
        mat[0][2]= 5;
        mat[0][3]= 7;
        mat[0][4]= 66;

        // 2.satır için
        mat[1][0]= 7;
        mat[1][1]= 8;
        mat[1][2]= 55;
        mat[1][3]= 32;
        mat[1][4]= 65;

        // değer atama
        for(int satir=0; satir<4; satir++ )
        {
            for(int sutun=0; sutun<5; sutun++) {
                mat[satir][sutun] = (int) (Math.random() * 100);
            }
        }

        //ekrana yazdırma
        for(int satir=0; satir<4; satir++ )
        {
            for(int sutun=0; sutun<5; sutun++) {
                System.out.print(mat[satir][sutun]+" ");
            }
            System.out.println();
        }
    }
}
