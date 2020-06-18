package replit.arrays;

public class AdvanceArrayGetSum {

        public static void main(String[] args) {
            // code start here
            String str="$12 $23 $10 $2 $5 $2";
            int sum = 0;
            String newstr=str.replace("$", "");

            String[] yenistr = newstr.split(" ");

            for (String c : yenistr) {

                sum=sum+Integer.parseInt(c);
            }


   System.out.print(sum);

        }


}
