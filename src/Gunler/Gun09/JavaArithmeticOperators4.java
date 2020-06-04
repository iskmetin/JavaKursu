package Gunler.Gun09;

public class JavaArithmeticOperators4 {
    public static void main(String[] args) {

        int a = 10;
        int sonuc = a +   ++a   +   a++   +   --a   -    a--;
            //     10      11        11        10         10     => 32
        System.out.println( "sonuc: " + sonuc );

        int i = 5;
        i--;  // 4
        i--;  // 3
        i--;  // 2
        i--;  // 1
        System.out.println(i);
    }
}
