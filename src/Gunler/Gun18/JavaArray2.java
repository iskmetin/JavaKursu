package Gun18;

public class JavaArray2 {
    public static void main(String[] args) {
        // dizileri aşağıdaki şekillerde tanımlayabiliriz.
        int[] dizi1=new int[5]; // 5 adet 0,1,2,3,4 indexli boş eleman oluşturuldu
        int[] dizi2={5,77,3,786,9,56,6,7,0,-34,6}; // eleman sayısı kadar uzunlukta dizi tanımlandı
        String[] dizi3=new String[5]; // String tipinde 5 elelamnlı içi boş dizi tanımlandı.
        boolean[] dizi4=new boolean[4]; // boolean (true, false) tipinde default değerli dizi
        double[] dizi5=new double[5]; // double cinsinden 5 elemanlı bir dizi

        for(int i=0;i<dizi1.length;i++)
            System.out.println("dizi1 (int) = " + dizi1[i]);

        for(int i=0;i<dizi2.length;i++)
            System.out.println("dizi2 (int)= " + dizi2[i]);

        for(int i=0;i<dizi3.length;i++)
            System.out.println("dizi3 (String)= " + dizi3[i]);

        for(int i=0;i<dizi4.length;i++)
            System.out.println("dizi4 (boolean)= " + dizi4[i]);

        for(int i=0;i<dizi5.length;i++)
            System.out.println("dizi5 (double)= " + dizi5[i]);
    }
}
