package Gunler.Gun17;

public class JavaNestedLoop6 {
    public static void main(String[] args) {
        //TODO Write program that prints this using loops
        // *
        // **
        // ***
        // ****
        // *****

        for(int satir=1; satir <=5 ;satir++)
        {
            for(int sutun=1; sutun <=satir ; sutun++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
