package Burak.Arrays_forEach_split.forEach;

public class c_forEach {
    public static void main(String[] args) {

        //TODO  For loop ile for Each loop'un farkı

        String[] StringArrayi = {"Alpha", "Beta", "Gamma", "Delta"};


        //FOR LOOP VERSİYONU.   Okunması zor. Yazması zor.
        System.out.println("For Loop : ");
        for (int i = 0; i < StringArrayi.length; i++){
            System.out.println(StringArrayi[i]);
        }


        //FOR EACH VERSİYONU.  Okunması kolay. Yazması kolay.
        System.out.println("\nFor each Loop: ");

        for (String Str : StringArrayi){
            System.out.println(Str);
        }




    }
}
