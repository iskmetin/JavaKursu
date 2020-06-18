package replit.arrays;

public class reverseString {
    public static void main(String[] args) {
        String input = "Hello World";
        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }

        System.out.print( output);
    }
}

