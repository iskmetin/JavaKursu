package Mentoring.haziran09;

public class IfElseStatementWithVariable {
    public static void main(String[] args) {
        int myVar = 9; //OCA question(post increment, pre increment)
        if (++myVar < 10) {
            System.out.println(myVar + "Hello world");
        } else {
            System.out.println(myVar + "Bye bye world");
        }
    }
}
