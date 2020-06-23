package projeler.project2;

import java.util.Arrays;

public class sumTotal {

    /*
        Create String 2D array

        {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

        if the String has $ multiply by 3.2

        if the String has € multiply by 4.2

        return the double

     */


    /*
        String 2D array oluştur

       {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

       String de $ varsa 3.2 ile çarp

       String de € varsa 3.2 ile çarp

       double return et

    */
    public static void main(String[] args) {

//        Koda burdan başlayın
        String[][] dizi={{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}};
        double sum=0;

        for(int i=0;i<dizi.length;i++){
            for(int a=0;a<dizi[i].length;a++){
                if(	dizi[i][a].contains("$")){
                    dizi[i][a] = dizi[i][a].replace("$", "");
                    sum=  sum+((3.2)* Double.valueOf(dizi[i][a]));

                }
                else if(	dizi[i][a].contains("€")){
                    dizi[i][a] = dizi[i][a].replace("€", "");
                    sum=  sum+((4.2)* Double.valueOf(dizi[i][a]));

                }
                else {

                    sum= sum+( Double.valueOf(dizi[i][a]));

                }

            }
        }


        System.out.println(sum);
    }
}
