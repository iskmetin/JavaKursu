package Odevler.haziran16;

public class odev1DahaBaskaYontem {
    public static void main(String[] args) {
        //TODO Write program that prints this using loops
        // ***********
        //  *********
        //   *******
        //    *****
        //     ***
        //      *
        String yildiz="***********";

        for (int i = 0; i < 6; i++) {
            String yeni = yildiz.substring(i,yildiz.length()-i);
            for (int a=0;a<i;a++){
                System.out.print(" ");
            }
            System.out.print(yeni);
            for (int b=0;b<i;b++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
