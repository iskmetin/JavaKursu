package projeler.project4.example;

public class ElectricityAccount {
    static double bill;
    double totalWph;
    double rate = 0.7;

    public double calculate() {

        bill += rate * totalWph;

        return bill;

    }


}
