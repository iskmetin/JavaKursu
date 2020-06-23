package projeler.project2;

public class minNumber {

      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

        print the min number from the 2d array
     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

         int 2D arrayini  olustur

        2D arrayinden min number print et

     */


    public static void main(String[] args) {

        int[][] dizi = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};
        int minnum = dizi[0][0];
        for (int i = 0; i < dizi.length; i++) {
            for (int a = 0; a < dizi[i].length; a++) {
                if (minnum > dizi[i][a]) {
                    minnum = dizi[i][a];
                }

            }

        }
        System.out.print(minnum);


    }
}








