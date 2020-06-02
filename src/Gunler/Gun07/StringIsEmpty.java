package Gunler.Gun07;

public class StringIsEmpty {
    public static void main(String[] args) {
        // String tamamen boşmu değil mi onu kontrol ediyor, sonuç true false

        String str1 = "Hi";
        System.out.println("str1 içi boş mu = " + str1.isEmpty());

        String str2 = "";
        System.out.println("str2 içi boş mu = " + str2.isEmpty());

        String str3 = " ";
        System.out.println("str3 içi boş mu = " + str3.isEmpty());
        boolean bosMu = str3.isEmpty(); // boolean değişkenine atanabilir.
    }
}
