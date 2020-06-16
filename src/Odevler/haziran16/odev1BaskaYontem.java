package Odevler.haziran16;

public class odev1BaskaYontem {
    public static void main(String[] args) {
        //TODO Write program that prints this using loops
        // ***********
        //  *********
        //   *******
        //    *****
        //     ***
        //      *
        for (int i = 0; i < 6; i++) {
            for (int x = 0; x < i;x++) {
                System.out.print(" ");
            }
            for (int y = 0; y+(2*i) < 11;y++) {
                System.out.print("*");
            }
            for (int x = 0; x < i;x++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
