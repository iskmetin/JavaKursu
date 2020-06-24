package replit.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Create one method name is getSum
This method has one parameter which is String ArrayList
Remove all the $ signs in the arraylist and sum all the numbers
return the total return type should be int
if the result less then 0 then print -1
Example :
ArrayList is : $13 , $15 , $20
result should be 48
Example 2:
ArrayList is : $-13 , $0 , $0
result should be -1
Note: add the imports if need to.

 */
public class method5 {
    public static void main(String[] args) {

        ArrayList<String> alist = new ArrayList<>(Arrays.asList("$13", "$15", "$20"));
        System.out.println(getSum(alist));

    }

    public static int getSum(ArrayList<String> alist) {
        Collections.replaceAll(alist, "$", "");

        int sum = 0;


        for (String c : alist) {
            String res = c.replace("$", "");
            sum = sum + Integer.parseInt(res);
        }
        if(sum>0){
            return sum;
        }
        else{
            return -1;
        }
    }
}
