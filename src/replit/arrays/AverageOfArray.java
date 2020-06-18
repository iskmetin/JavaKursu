package replit.arrays;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] seri={12,14,21,23,10,4};
        int sum=0;
        for(int a:seri){
            sum=sum+a;
        }
        System.out.print(sum/seri.length);
    }
}
