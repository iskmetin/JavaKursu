package Gunler.Gun09;

public class JavaArithmeticOperators3 {
    public static void main(String[] args) {
        // artırma ve azaltma operatörü
        int a=5;
        int b=2;
        int k=0;

        a++; // a nın değerini bir artır => a=a+1 le aynı -> 6
        ++a; // a nın degerini bir artır => a=a+1 le aynı -> 7

        k = a++; //  ++ lar sağda olduğu için , önce k=a çalışır , sonra a=a+1; k=7, a=8
        k = ++a; //  ++ lar solda olduğu için , önce a=a+1 çalışır, sonra k=a;  a=9, k=9

        a--; // a nın değerini bir azaltır => a=a-1 le aynı -> 8
        --a; // a nın degerini bir azaltır => a=a-1 le aynı -> 7

        k = a--; // -- ler sağda olduğu için, önce k=a çalışır, sonra a=a-1 ;k=7, a=6
        k = --a; // -- ler solda olduğu için, önce a=a-1 çalışır, sonra k=a ;a=5, k=5

//        ++ veya -- değişkenin sağındaysa: önce işlemleri yap,
//        sonra değişkenin değerini 1 artır veya azalt
//
//        ++ veya -- değişkenin SOLUNDAYSA: önce değişkenin
//        kendi değerini 1 artır veya azalt sonra işlemleri yap
    }
}
