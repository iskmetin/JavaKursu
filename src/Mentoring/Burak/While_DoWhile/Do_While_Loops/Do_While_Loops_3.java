package Burak.While_DoWhile.Do_While_Loops;

public class Do_While_Loops_3 {
        public static void main(String[] args) {

            int count = 11;          //KOŞUL SAĞLANMADIĞINDA ÇALIŞMAZ
            while(count < 11) {
                System.out.println("Count is: " + count);
                count++;
            }

            int doCount = 11;        //KOŞUL SAĞLANMADIĞINDA DAHİ DO BİR KERE ÇALIŞIR.
            do{
                System.out.println("DoCount is: " + doCount);
                doCount++;
            } while(doCount < 11);
        }
    }

