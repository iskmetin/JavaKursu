package projeler.project3;
public class asd {


    public static int minCostClimbingStairs(int[] arr){
        int first=0;
        int second=0;
        for(int i=0; i<arr.length;i++){
            int recent=arr[i]+Math.min(first,second);
            first=second;
            second=recent;
        }
        return Math.min(first,second);

    }

    public static void main(String[] args) {

        int[] i1 = new int[]{1,10,3,5,100};
        int t=  minCostClimbingStairs(i1);

        System.out.println(t);
    }

}
