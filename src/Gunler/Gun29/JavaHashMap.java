package Gunler.Gun29;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {

        Map<Integer,Integer> m=new HashMap<>();
        m.put(2,11); // 2 anahtarına 11 değeri set edildi
        m.put(3,12);
        m.put(4,13);
        m.put(2,14); // 2 anahtarındaki değer güncellendi

        System.out.println("m.get(2) = " + m.get(2)); // 2 anahtarındaki değer alındı  m.get(2) = 14
        System.out.println("m.keySet() = " + m.keySet());  // anahtar listesi keyler m.keySet() = [2, 3, 4]
        System.out.println("m.values() = " + m.values()); // değerler listesi values m.values() = [14, 12, 13]
        System.out.println("m = " + m); // m = {2=14, 3=12, 4=13}

        //2.Yöntemler
        for(Integer ky: m.keySet())
        {
            System.out.println("ky = " + ky);
        }

        for(Integer vl: m.values())
        {
            System.out.println("vl = " + vl);
        }

        for(Map.Entry<Integer,Integer> anahtarVeDeger:  m.entrySet())
        {
            System.out.print("anahtarVeDeger.getKey() = " + anahtarVeDeger.getKey()); // bu anahtarı veriyor
            System.out.print(",  anahtarVeDeger.getValue() = " + anahtarVeDeger.getValue()); // bu ise değeri veriyor
            System.out.println();
        }

        boolean buAnahtarVarMi = m.containsKey(2); // 2 şeklinde bir anahtar var mı ?
        boolean buDegerVarMi = m.containsValue(12); // 12 değeri var mı?

        System.out.println("buAnahtarVarMi = " + buAnahtarVarMi);
        System.out.println("buDegerVarMi = " + buDegerVarMi);

        m.remove(2);
        System.out.println("remove 2 den sonra m = " + m);

        m.clear();
        System.out.println("clear den sonra m = " + m);
    }
}
