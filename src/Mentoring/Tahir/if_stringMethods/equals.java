package Tahir.if_stringMethods;

public class equals {
    public static void main(String[] args) {
//        int a=3;
//        int b=5;
//
//        if(a==b){
//            System.out.println("They are equal.");
//        }
//
//        if(a!=b){
//            System.out.println("They are not equal");
//        }

        String s1 = "We";
        String s2 = "You";

        // s1.equals(s2)     s1 s2 ye esittir
        // !s1.equals(s2)    s1 s2 ye esit degildir

        if (s1.equals(s2)) {
            System.out.println("They are equal");
        }

        if (!s1.equals(s2)) {
            System.out.println("They are not equal");
        }
    }
}
