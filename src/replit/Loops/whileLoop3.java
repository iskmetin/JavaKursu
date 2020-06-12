package replit.Loops;

public class whileLoop3 {
    public static void main(String[] args) {
        int x = 30;

        //Kodu aşağıya yazınız.

        x = 29;
        do {
            if (x % 2 == 0) {
                System.out.print(x);
            }
            x--;

        } while (x >= 0);
    }
}