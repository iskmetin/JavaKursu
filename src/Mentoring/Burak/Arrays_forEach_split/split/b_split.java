package Burak.Arrays_forEach_split.split;

public class b_split {
    public static void main(String[] args) {

        //todo Bir Scanner oluşturup bir tarih giriniz. Örn: (19/08/2020) Bu tarihteki / işsaretlerine split methodu uygulayınız.
        String str = new String("09/12/1996");

        System.out.println("Doğum günüm: ");

        String[] array = str.split("/");  // / (Slash) karakterini gördüğünde split methodu uygular.

        for (String date : array){
            System.out.println(date);
        }

    }
}
