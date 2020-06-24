package replit.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Instructions from your teacher:
getSum isminde bir method oluşturun.
Parametresi ArrayList'tir.
Dizideki tüm $ ları kaldır ve tüm sayıları topla
return yaptğımız veri tipi 'int' olmalıdır.
sonuç 0'dan küçükse, -1 yazdırın.
Örnek1:
ArrayList = $13, $15, $20
Cevap = 48 olmalı
Örnek 2 :
ArrayList= $-13, $0, $0
Cevap = -1 olmalı.


 */
public class method5yeni {
    public static void main(String[] args) {

        ArrayList<String> alist = new ArrayList<>(Arrays.asList("$13", "$15", "$20"));
        System.out.println(getSum(alist));

    }

    public static int getSum(ArrayList<String> alist) {
        Collections.replaceAll(alist, "$", "");

        int sum = 0;


        for (String c : alist) {
            String res = c.replace("$", "");
            sum = sum + Integer.parseInt(res);
        }
        if(sum>0){
            return sum;
        }
        else{
            return -1;
        }
    }
}
