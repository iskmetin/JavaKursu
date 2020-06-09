package Mentoring.haziran09;

public class IfElseStatementWithTrim {
    public static void main(String[] args) {
        String myStr = " ";
        myStr = myStr.trim();

        if (myStr.isEmpty()) {
            System.out.println("yeap");
        } else {
            System.out.println("nope");
        }
    }
}
