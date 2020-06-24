package replit.methods;

import java.util.Arrays;
import java.util.Scanner;

public class method14 {
    /*Write a method called append

    append adında bir method oluşturun.

    Parametre olarak iki int array  oluşturun.

    ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.


            Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,

    Bunu döndürmelidir:
    {2, 4, 6, 1, 2, 3, 4, 5}.
*/



    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.println("Bir sayi gir");
        String[] t = oku.nextLine().split(" ");
        int[]a=new int[t.length];
        for(int i=0;i<t.length;i++){
            a[i]=Integer.parseInt(t[i]);
        }
        System.out.println("Bir sayi daha gir");
        String[] s = oku.nextLine().split(" ");
        int[]b=new int[s.length];
        for(int i=0;i<s.length;i++){
            b[i]=Integer.parseInt(s[i]);
        }


        System.out.println(Arrays.toString(append(a,b)));
    }

    public static int[] append(int[]a ,int[]b) {
        int[] c=new int[a.length+b.length];
        for(int i=0;i<c.length;i++){
            if(i<a.length){
                c[i]=a[i];
            }
            else{
                c[i]=b[i-a.length];
            }
        }
        return c;
    }

    }