package Gunler.Gun09;

public class JavaAssignmentOperators1 {
    public static void main(String[] args) {
        int a=10;
        int b=2;

        a+=5;  // a=a+5 le aynı, kısa yazılışı => a=15;
        a-=5;  // a=a-5 le aynı => a=10; (en son değer alınır bir üstte 5 artmıştı)

        a*=2;  // a=a*2 le aynı => a=20; (en son değer 10 du)
        a/=2;  // a=a/2 le aynı => a=10; (en son değer 20 idi)

        a%=2;  // a=a%2 le aynı => a=0 (en son değer 10 idi)
    }
}
