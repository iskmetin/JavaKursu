package replit.Loops;

public class nestedLoop3 {
    public static void main(String[] args) {
        int a = 5;
        for(int i =0; i < 5; i++){
            for(int j = a*2; j > 0; j--){
                System.out.print(" ");
            }
            a--;
            for(int x = 0; x <= i; x++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}