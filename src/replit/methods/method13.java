package replit.methods;

import java.util.Scanner;

public class method13 {


    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.println("Bir sayi gir");
        String[] t = oku.nextLine().split(" ");
        int[]cost=new int[t.length];
        for(int i=0;i<t.length;i++){
            cost[i]=Integer.parseInt(t[i]);

        }


        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {
        for(int i=2;i<cost.length;i++){
            cost[i]+=Math.min(cost[i-1],cost[i-2]);

        }
        return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }

    }