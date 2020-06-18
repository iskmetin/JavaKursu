package deneme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class deneme {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        String result = "";
        for (int i = 0; i < 4; i++) {
            if (i == 0 && numbers.get(i) != 0) {
                result += numbers.get(i).toString();
            }
            else
                result += numbers.get(i).toString();
        }
        System.out.println(result);
    }
}


