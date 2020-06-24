package Gun22;

public class JavaMethods3 {
    public static void main(String[] args) {
        tekMiCifMi(3);
        tekMiCifMi(4);
        topla(3,4);
        topla(43,64);
    }

    public static void topla(int a, int b)
    {
        System.out.println("Toplam = " + (a+b));
        tekMiCifMi(a);
        tekMiCifMi(b);
    }

    public static void tekMiCifMi(int sayi)
    {
        if (sayi%2==1)
            System.out.println("Tek");
        else
            System.out.println("Çif");
    }
}
