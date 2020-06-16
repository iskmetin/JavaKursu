package dosSolution;

public class Customer {

    String name;
    ElectricityAccount electricityAccount;

    public void consumeElectricity(double wph){
        electricityAccount.totalWph+=wph;
    }

}
