package replit.arrays;

public class WordCount {
    public static void main(String[] args) {
        String cumle="Removes white space from both ends of a string";
        int spaceCount = 0;
        for (char c : cumle.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        System.out.print(spaceCount+1);
    }
}