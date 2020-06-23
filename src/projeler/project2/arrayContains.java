package projeler.project2;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class arrayContains {

    /*
        Given two arrays of ints sorted in increasing order,
        outer and inner,
        return true if all of the numbers in inner appear in outer.
        Verify first array contains second array.

        linearIn([1, 2, 4, 6], [2, 4]) → true
        linearIn([1, 2, 4, 6], [2, 3, 4]) → false
        linearIn([1, 2, 4, 4, 6], [2, 4]) → true

     */

    /*

         Artan düzende sıralanmış iki adet ınt array göz önüne alındığında,
         dış ve iç,
         içteki tüm sayılar dışta görünüyorsa true değerini döndürür.
         İlk arrayin ikinci arrayi içerdiğini doğrulayın.

         linearIn([1, 2, 4, 6], [2, 4]) → true
         linearIn([1, 2, 4, 6], [2, 3, 4]) → false
         linearIn([1, 2, 4, 4, 6], [2, 4]) → true

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] arr = myStr.split(" ");
        int[] myArr = new int[5];
        for(int i = 0 ; i< arr.length ; i++){
            int num = Integer.parseInt(arr[i]);
            myArr[i] = num;
        }

        int[] UseThisArray1 = new int[3];
        int[] UseThisArray2 = new int[2];

        for(int i = 0 ; i <3 ; i++){
            UseThisArray1[i] = myArr[i];
        }

        for(int i = 3 ; i <5 ; i++){
            UseThisArray2[i-3] = myArr[i];
        }

//        Code start here
//        Use the array name UseThisArray1 and UseThisArray2

//        Koda burdan başla
//        UseThisArray1 ve UseThisArray2 array isimlerini kullan
        boolean[] seri = new boolean[UseThisArray2.length];
        for (int i = 0; i < UseThisArray2.length; i++) {

            int finalI1 = i;
            if (IntStream.of(UseThisArray1).anyMatch(x -> x == UseThisArray2[finalI1])) {
                seri[i] = true;

            } else {
                seri[i] = false;
            }


        }
        String[] strseri = new String[seri.length];
        for(int i=0;i<strseri.length;i++){
            strseri[i]=String.valueOf(seri[i]);
        }

        if (Arrays.stream(strseri).anyMatch("false"::equals)) {
            System.out.println(false);

        }else{
            System.out.println(true);
        }
    }
}


