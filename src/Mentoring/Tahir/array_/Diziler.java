package Tahir.array_;

import java.util.Arrays;
import java.util.Scanner;

public class Diziler {
    public static void main(String[] args) {
        // Belli verileri depoladigimiz bir liste(yigin) gibi dusunebiliriz

        /* ====================================================================================================    */
        int a = 2;// tek degiskenle sadece tek deger tanimliyoruz

        int[] b = {2, 3, 4, 5, 6, 7};  // array ile 6 tane deger tanimliyoruz

        /* ====================================================================================================    */
        //Array yazma sekilleri:


        int[] arr = new int[10];  // bellekte a referansli 10 tane yer aciliyor.
        //int arr []=new int[10];// artik sadece 10 tane deger atayabilirsiniz. 11 olmaz
        // bellekteki yeri onceden ayirip sonra deger atiyoruz
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
        // arr[10]=11;
        // System.out.println(arr[10]);
        /* ====================================================================================================    */
        //arr[10]=11;   // yaabilirsiniz compile hata vermez. ama calisiriken hata verir. runtime exception olur
        // bu sekilde yazmak zor olur
//        int[] arr1={1,2,3,4,5,6,7,8,9,10,}; // bellekteki yeri deger atarken olusturuyoruz
//        int[] arr2={1,2,3,4,5,}; // bellekteki yeri deger atarken olusturuyoruz
//        System.out.println(arr1[3]);
//        //System.out.println(arr1[11]);// hata verecek
//       // System.out.println(arr2[5]); // hata
//        System.out.println(arr2[3]);
        /* ====================================================================================================    */
        // belli bir duzene gore artan ve azalan arraye degerler atamak yazdirmak
        // cift sayilar
        // tek sayilar
//        int [] array=new int[5];
//
//        for (int i = 0; i <5 ; i++) {
//            //array[i]=i;
//            array[i]=2*i;
//            /*
//            i=0 arr=0
//            i=1 arr=2
//            i=2 arr=4
//            i=3 arr=6
//            i=4 arr=8
//            //i=5 arr=10
//
//             */
//           // array[i]=4*i-1;
//
//            System.out.println(array[i]);
//        }
//

        /* ====================================================================================================    */
        // rasgele duzene gore for kullanarak yazdirmak

        //Arrayimizi kullanicidan adigimiz degerlerle baslatabiliriz
//        int [] c=new int[5];
//
//        Scanner scan=new Scanner(System.in);
//        System.out.println(c.length);
//        for (int i = 0; i <c.length; i++) {
//            System.out.println("Arrayin "+(i+1)+" .ci elemanini gir");
//            c[i]=scan.nextInt();
//        }
//        System.out.println("girdigimiz degerleri for dongusu ile yaziriyoruz");
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i]);
//
//        }
//      System.out.println(Arrays.toString(c));  // --->  [2, 34, 5, 12, 4]
//
//        System.out.println("*****************************************************");
        /* ====================================================================================================    */
        // array uzunlugu
//        int []d={40,20,10,80,70,50};
//        System.out.println("Arrayin uzunlugu "+ d.length);
//        /* ====================================================================================================    */
//        // kucukten buyuge yazdirmak(ordering)
//        System.out.println(Arrays.toString(d));
//        Arrays.sort(d);
//        System.out.println(Arrays.toString(d));
//        /* ====================================================================================================    */
//
//        String []str1={"a","b","c","d"};
//        String [] str2={"a","b","c","d"};
//
//        System.out.println(Arrays.equals(str1,str2));

        /* ====================================================================================================    */

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String cumle = oku.nextLine();

        String[] kelimeler1 = cumle.split(" "); // boşluk karakterine göre böler ve diziye atar
        System.out.println(Arrays.toString(kelimeler1));
        System.out.println(kelimeler1[1]);
        String[] kelimeler2 = cumle.split(""); //  karakterlerin arasini böler ve diziye atar
        System.out.println(Arrays.toString(kelimeler2));


//
//
//
//
//
//
//


    }


}
