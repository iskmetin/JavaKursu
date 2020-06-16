package Gunler.Gun16;

public class GununSorusu9 {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        for(int i=0; i<=255;i++)
        {
            char c=(char)i;  // bilgisayar harfleri bilmez ,bu sebeple saklayamaz
            // bu yüzden karakterleri karşılık gelen bir sayı ile saklar.
            // bu yüzden char yani karakterler aslında sayı olarak saklanır.
            // bu özellikten dolayı char saklanacak yere direk karakterin karşılık gelen sayısı
            // atanabilir yani A harfi de tanabilir, 65 i char a çevirip de atanabilir.
            System.out.println(i+" - "+c);
        }


        int i=0;
        while (i<=255){
            char c=(char)i;
            System.out.println(i+" - "+c);
            i++;
        }

    }
}
