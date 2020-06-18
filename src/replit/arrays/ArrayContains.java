package replit.arrays;

public class ArrayContains {
        public static void main(String[] args) {
            // code start here
            String[] seri={"Apple","Orange","Banana","pineapple"};
            int i=0;
            while (i<seri.length){
                if(seri[i]=="Apple"){
                    System.out.println(true);
                    break;
                }

                i++;
            }

        }
    }

