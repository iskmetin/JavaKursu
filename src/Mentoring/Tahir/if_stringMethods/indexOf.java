package Tahir.if_stringMethods;

public class indexOf {
    public static void main(String[] args) {
        String str = "aaacabaaabaab";

        System.out.println("ilk a karakterinin indexi " + str.indexOf('a'));
        System.out.println("ikinci a nin index " + str.indexOf('a', 1));
        System.out.println(str.indexOf('a', 8));
        System.out.println(str.indexOf('b'));
        System.out.println(str.lastIndexOf('b'));
        System.out.println(str.indexOf('b', 7));


        String s = "Benim ismim Tahir ";


        // System.out.println(s.replace(s.replace(s.indexOf('i',7)),'y'));


    }
}
