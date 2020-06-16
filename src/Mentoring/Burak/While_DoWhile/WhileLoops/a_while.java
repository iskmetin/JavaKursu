package Burak.While_DoWhile.WhileLoops;

public class a_while {
    public static void main(String[] args) {

        /*
            döngü değişkeni

            while(koşul){

            işlem1
            işlem2
            işlem3

            arttırma, azaltma i++; i--;

            }
         */

        int sayi = 0;
        int sayac = 0;

        while (sayi < 10){

            sayi++;
            sayac++;

            System.out.println("LOOP " + sayac);
        }
    }
}
