package Odevler.haziran16;

public class odev1 {
    public static void main(String[] args) {
        //TODO Write program that prints this using loops
        // ***********
        //  *********
        //   *******
        //    *****
        //     ***
        //      *
        for (int i = 0; i < 6; i++) {

            System.out.println(" ".repeat(i) + "*".repeat(11 - (2 * i)) + " ".repeat(i));
        }
    }
}
