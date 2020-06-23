package Gunler.Gun21;


public class JavaMat2 {
    public static void main(String[] args) {
        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //   2D arrayinden max number print et
        int[][] mat={   {-1,-2,-3}, {-2,-3,-1} , {-5,-5,-5} , {-2,-10,-3}   };
                  //    mat[0]    mat[1]    mat[2]
        int max=mat[0][0];

        for(int i=0;i<mat.length;i++) // mat.length => satır sayısını verir yani 4
        {
            for(int j=0;j<mat[i].length;j++)  // 3 ün yerine mat[i] satır temsil ediyor mat[i].length
            {
                if (mat[i][j] > max)
                    max=mat[i][j];
            }
        }

        System.out.println("max = " + max);
    }
}
