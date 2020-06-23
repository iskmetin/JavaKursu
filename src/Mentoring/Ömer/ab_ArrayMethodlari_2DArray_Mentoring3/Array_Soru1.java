package Ömer.ab_ArrayMethodlari_2DArray_Mentoring3;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Soru1 {
    public static void main(String[] args) {

        /*

todo Soru 1

 int array oluşturun.
 Sistem size "Kaç elemanlı bir Array oluşturmak istiyorsunuz ? (!!Tek sayı olmalı !! :  )  " şeklinde bir soru sorsun.

 Array'in kaç elemandan oluşacagına kullanıcı karar versin. (3,5,7)

 ve bu elemanları kullanıcıdan alın. (Scanner)     (1. sayıyı giriniz  ... .... )

 Array'in içindeki elemanları küçükten büyüğe sıralayın .(method kullanın)

  ve            'ortadaki'              elemanı bulması için bir program yazın. (Her ihtimali düşünmeniz gerekiyor. sadece 3 elemanlı bir array için değil, 33 elemanlı bir array için de çalışmalı).

  örn:  5 elemanlı bir array

 [ 1,2,6,7,8}
 ortanca sayı = 6

 */

        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç elemanlı bir dizi olusturmak istiyorsunuz ? (Tek sayı olmalı )  : " );
        int [] a = new int[sc.nextInt()];


        for (int i = 0; i <a.length ; i++) {
            System.out.print((i+1) + ". sayıyı giriniz.");
            a[i] =sc.nextInt();
        }

        int ortancaSayi1 = (a.length-1)/2;              // [1,2,3,4,5,6,7]

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if (i==ortancaSayi1){
                System.out.println("Ortanca Sayı:  " + a[i]);
            }
        }
















    }
}
