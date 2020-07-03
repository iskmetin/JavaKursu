package projeler.project4;

public class DigitPowers {
    /*

          Given one method name is power4
          Parameter is one int()
          Return type is an int

          Get each digit from the parameter int number
          Take the each number to the power 4
          Sum powered numbers
          Return the result

          Example: parameter int is 1234

          1⁴ + 2⁴ + 3⁴ + 4⁴ = 1 + 16 + 81 + 256

          result should be 354

       */


    /*


         Verilen methodun ismi power4
         Parametresi int
         Return tipi de int dir


         Girilen int parametresinin rakamlarının ayrı ayrı
         4.kuvvetini alıp toplayın

         Örnek: parameter int is 1234

         1⁴ + 2⁴ + 3⁴ + 4⁴ = 1 + 16 + 81 + 256

         result  354 olmalı

      */

    public static void main(String[] args) {
        System.out.println(power4(1234));
    }
    public static int power4(int num) {
        int sonuc=0;
        String[] sayi=String.valueOf(num).split("");
        for(int i=0;i<sayi.length;i++){
            sonuc+=(int)Math.pow(Integer.parseInt(sayi[i]), 4);

        }

        return sonuc;
    }


}
