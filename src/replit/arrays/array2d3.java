package replit.arrays;


import java.util.Arrays;

public class array2d3 {    // code start here
    public static void main(String[] args) {


        String[][] dizi = {{"new jersey", "atlanta", "ohio"}, {"Pittsburgh", "ohio", "new york", "ohio"}, {"ohio", "new york"}};
        for (int i = 0; i < dizi.length; i++) {
            for (int a = 0; a < dizi[i].length; a++) {
                if (dizi[i][a] == "ohio") {
                    dizi[i][a] = "Florida";
                }


            }
        }

        System.out.println(Arrays.deepToString(dizi));
    }

}
