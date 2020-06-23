package Ömer.ab_ArrayMethodlari_2DArray_Mentoring3;

public class Arrays2D {
    public static void main(String[] args) {

            //tek boyutlu array
        int [] array = {1,2,3,4,5};

        //çift boyutlu array
        //                                  0           1
        int [] [] d2Array ={{30,50},{25,10}};
        //                                0   1       0    1

//spesifik eleman seçme

//        System.out.println(d2Array[1][1]);
//

        //yazdırma şekli

        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j < 2; j++) {


                System.out.print(d2Array[i][j] + " ");

            }
            System.out.println();
        }


    }
}
