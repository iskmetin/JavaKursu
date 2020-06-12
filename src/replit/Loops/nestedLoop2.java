package replit.Loops;

import java.util.Scanner;

public class nestedLoop2 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int a=0;a<=i;a++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}