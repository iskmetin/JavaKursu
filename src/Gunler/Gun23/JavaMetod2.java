package Gunler.Gun23;

public class JavaMetod2 {
    public static void main(String[] args) {
        int sayi1=5;
        int sayi2=7;

        int sonuc=toplamBul(sayi1,sayi2);

        Math.max(3,4); // bu şekilde yazmamızın hiç bir faydası yok,
        // çünkü işlemin sonucu herhangi bir değişkene atanmadı

        int sayi3=7;
        // bana önceki toplamın değeri lazım, şu anda sonuca toplamın sonucu geldi
    }

    public static int toplamBul(int a, int b)
    {
        int toplam=a+b;
        System.out.println("toplam = " + toplam);

        return toplam;
    }
}
