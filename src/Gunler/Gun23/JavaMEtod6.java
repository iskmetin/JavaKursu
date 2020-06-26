package Gunler.Gun23;


public class JavaMEtod6 {
    public static void main(String[] args) {

        ortalamaBulYaz("Ali", 60, 80, 85, 95, 100,60);
        ortalamaBulYaz("Mehmet", 60, 75, 55, 90);
        ortalamaBulYaz("Ayşe", 65, 70, 75);
        ortalamaBulYaz("Ömer", 60, 80, 85, 95, 60);
    }

    // ... ile iligli 2 kural var
    // 1- Bir metodda parametre olarak sadece 1 tane olabilir
    // 2- Her zaman en sonda olmalı
    public static void ortalamaBulYaz(String isim, int... notlar)
    {
        double toplam=0;

        for(int not : notlar) // foreach
        {
            toplam += not;
        }

        System.out.println(isim+" "+toplam/notlar.length);
    }
}
