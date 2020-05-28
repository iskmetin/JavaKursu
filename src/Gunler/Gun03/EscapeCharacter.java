package Gunler.Gun03;

public class EscapeCharacter {
    public static void main(String[] args) {

        // Yorum satırı oluşturma kısa yolu :
        // ctrl ile /  tuşuba basılırsa //
        // ctrl+shift   /   tuşuna basılırsa  /*   */  yorum satırı oluşur
        /* System.out.println("Pazartesi");
        System.out.println("Salı");
        System.out.println("Çarşamba");*/

        // yeni satır açar   \n
        //System.out.println("Pazartesi \n Salı \n Çarşamba");

        // tab tuşu etkisi yapar :  \t
        //System.out.println("Pazartesi \t Salı");
        //System.out.println("\tPazartesi Salı");

        // Çift tırnak koymak için :  \"
        //System.out.println("Java");  //    "Java"
        //System.out.println(" \"Java\" ");

        System.out.println("Java");  //  "\Java"
        System.out.println("\\Java");

    }
}
