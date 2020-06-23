package Odevler.haziran20;

import java.util.Arrays;

public class Array_Soru3_Odevler {
    public static void main(String[] args) {

        /*

iki ayrı int array oluşturun. İkisinin de eleman sayısı  5 olsun.

Elemanlar random atansın. (15 e kadar - 15 dahil)


2 int array'i de ekrana yazdırınız.  (1.dizi =
                                                        2.dizi=        )



Eğer iki arrayda ortak elemanlar varsa o elemanları yazdırınız.
Yoksa, "ortak eleman yoktur" mesajını konsola yazdırınız.

ÖRNEK:
1.Dizi : [1,2,3,4,5]
2.Dizi : [4,5,6,7,8]

ortak eleman: 4     ortak eleman: 5

    // TODO: 1  İpucu :

           Ortak eleman ararken oluşturacağınız koşula int count ekleyin. (int count = 0;)
Eğer ortak eleman varsa count++.
Eğer ortak eleman yoksa, count==0 ise           "ortak eleman yoktur".

         */

    int[] a=new int[5];
    int[] b=new int[5];
    for(int i=0;i<5;i++){
        a[i]=(int)(16*Math.random());
        b[i]=(int)(16*Math.random());
    }
    int count=0;
    for(int x=0;x<5;x++){
        for(int y=0;y<5;y++){
            if(a[x]==b[y]){
                count++;
            }
        }
    }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    if(count>0){
        System.out.println(count+" tane ortak var");
    }
    else{
        System.out.println("Ortak eleman yoktur");
    }


    }
}
