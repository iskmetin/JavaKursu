package Gunler.Gun09;

public class JavaArithmeticOperators1 {
    public static void main(String[] args) {
        int a=8;
        int b=4;

        System.out.println("Toplama işlemi");
        System.out.println("a+b = " + (a+b));
        System.out.println("5+2 = " + (5+2));

        System.out.println("Çıkarma işlemi");
        System.out.println("a-b = " + (a-b));
        System.out.println("5-2 = " + (5-2));

        System.out.println("Negatifleştirme");
        System.out.println("b negatifleştirilirse: "+ (-b) );
        a=-a; // bir değişkenin negatif değeri lazım ise, sayıyı -1 le çarpmak gibi
        System.out.println("a nın şuan ki değeri = " + a);
    }
}
