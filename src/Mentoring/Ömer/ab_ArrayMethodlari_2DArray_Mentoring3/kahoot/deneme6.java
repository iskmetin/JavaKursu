package Ömer.ab_ArrayMethodlari_2DArray_Mentoring3.kahoot;

public class deneme6 {

    public static void main(String[] args) {


        String[] array = {"elma", "armut", "erik"};

        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("e")) {
                System.out.println(array[i].replace("e", "X"));

            } else
                System.out.println("e harfi yoktur.");
        }

    }
}
