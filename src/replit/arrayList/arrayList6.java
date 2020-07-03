package replit.arrayList;

import java.util.ArrayList;

public class arrayList6 {
    /*hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
     2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.*/
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(5);
        a.add(4);
        a.add(6);
        a.add(2);
        a.add(1);
        System.out.println(hillNum(a));
    }

    public static int hillNum(ArrayList<Integer> a) {
        int b = 0;
        for (int i = 1; i < a.size() - 1; i++) {
            if (a.get(i) < a.get(i - 1) && a.get(i + 1) < a.get(i)) {
                b = a.get(i);
            } else {
                b = a.get(i);
            }

        }
        return b;

    }

}