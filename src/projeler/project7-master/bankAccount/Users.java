package bankAccount;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Users {

    /*
        Create String variable name password dateOfBirth marriageStatus  relativeName relativeAge isTransferedSuceesfully
        Create int  accountNumber amountAccount1 accountNumber2 amountAccount2

        all public
     */

    public String name;
    public String password;
    public String dateOfBirth; // format should be MM-dd-yyyy
    public String marriageStatus;
    public int accountNumber ;
    public int amountAccount1;
    public int accountNumber2;
    public int amountAccount2;
    String relativeName;
    String relativeAge;

    String isTransferedSuceesfully;

    /*
    Create a constructor
    Parameters are String name , passwod , dateOfBirth , marriageStatus
    Int amountAccount1 , amountAccount2

    variable name equal to parameter name
    same for password
    same for amountAccount1
    same for amountAccount2

    Following also in the constructor

    variable accountNumber get the the number from the  randomNumberCreader method
    variable accountNumber2 get the the number from the  randomNumberCreader method
    variable marriageStatus equal to CheckMariageStatus method return
    variable dateOfBirth equal to checkAge return

     */
    public Users(String name , String password , String dateOfBirth ,String marriageStatus , int amountAccount1 , int amountAccount2){

        this.name = name;
        this.password = password;
        this.amountAccount1 = amountAccount1;
        this.amountAccount2 = amountAccount2;
        this.marriageStatus = CheckMariageStatus(marriageStatus);
        this.dateOfBirth = checkAge(dateOfBirth);
        accountNumber = randomNumberCreader();
        accountNumber2 = randomNumberCreader();

    }

    /*
        Create method name is  CheckMariageStatus
        parameter is String(marriageStatus)
        return type is String

        if String marriageStatus is married

        Ask to user (use scanner class)
        Do you want to add add your relative?

        if the user say Yes
        Ask to user
        What is your relative name?
        Ask to user
        Date of birth relative?

        Then Add the relative(Use AddRelative class )
        relativeName variable equal to AddRelative class fullName
        relativeAge variable equal to AddRelative class age

            if relativeAge equal to "0"
                then change the relativeName to "Relative should be more then 18 years old";
                then change the relativeAge to "Relative should be more then 18 years old";
                return the "Relative should be more then 18 years old";
            if the relativeAge is not equal to "0"
               return Transaction done successfully

        If the user say No
        then no need to add anything.
     */

    public String CheckMariageStatus(String marriageStatus){

        String res = "";

        if(marriageStatus.equals("married")){
            Scanner dp = new Scanner(System.in);
            System.out.println("Do you want to add add your relative?");
            String answer = dp.nextLine();
            if(answer.equals("Yes")){
                System.out.println("What is your relative name?");
                String rname = dp.nextLine();
                System.out.println("Date of birth relative?");
                String age = dp.nextLine();
                AddRelative a1 = new AddRelative(rname , age);
                relativeName =a1.fullName;
                relativeAge = a1.age;

                res= "Transaction done successfully";

                if(relativeAge.equals("0")){
                    relativeName = "Relative should be more then 18 years old";
                    relativeAge = "Relative should be more then 18 years old";
                    res= "Relative should be more then 18 years old";
                }

            }else{
                res =  "Not able to add relative";
            }
        }
        return res;
    }

    /*
        Create a static method name is checkAge
        parameter is one String(myDOB)
        return type is String

        Compare today date to myDOB

        if myDOB compare to today date is 18 then return "You can get a credit card"

        if myDOB compare to today date is less then 18 "You should be at least 18 years old to get a credit card."

        For example today date is 10/05/2020

        if myDOB is 09/05/2002

        return should be  "You can get a credit card"

        if myDOB is 11/05/2002

        return should be  "You should be at least 18 years old to get a credit card."

     */

   public static String checkAge(String age){

       LocalDate date = LocalDate.now();
       DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
       String text = date.format(formatters);
       LocalDate today = LocalDate.parse(text, formatters);

       LocalDate myAge = LocalDate.parse(age, formatters);

       int num = today.compareTo(LocalDate.parse(age, formatters));

       String result ="";

       if(num>18){

           result = "You can get a credit card";

       }else if(num < 18){

           result = "You should be at least 18 years old to get a credit card.";

       } else if(num==18){

           if( today.getMonthValue()>myAge.getMonthValue()){

               result = "You can get a credit card";

           }else if(today.getMonthValue()<myAge.getMonthValue()){

               result = "You should be at least 18 years old to get a credit card.";

           }else if(today.getMonthValue()==myAge.getMonthValue()){

               if(today.getDayOfMonth()>myAge.getDayOfMonth()){

                   result = "You can get a credit card";

               }else {

                   result =  "You should be at least 18 years old to get a credit card.";
               }
           }
       }

       return result;

    }



    /*
        Create a Random number which is returning 8 digit number

            it should be between 10000000 - 99999999

     */

    public int randomNumberCreader(){

        Random rnd = new Random();

        int random = rnd.nextInt(99999999-10000000)+10000000;

        return random;

    }

    /*
        Create a method name is transfer
        Parameters are two Users object
        Return type is void

        In this method
            First ask to user "Do you want to transfer between your accounts or different user" (use scanner class)

        if the answer is own
            Call the method transferToOwnAccount in the Account class

        if the answer different
            Call the method transferOtherUser in the Account class

     */
    public void transfer(Users user  , Users user2 ){

        System.out.println("Do you want to transfer between your accounts or different user");

        Scanner dp = new Scanner(System.in);

        String ownOrSelf = dp.nextLine();

       if(ownOrSelf.equals("own")){

           System.out.println("Enter amount of money you want to enter");

           int transferAmount = dp.nextInt();

           isTransferedSuceesfully = Account.transferToOwnAccount(user , transferAmount);

       }else {

           System.out.println("Enter amount of money you want to enter");

           int transferAmount = dp.nextInt();

           isTransferedSuceesfully = Account.transferOtherUser(user , user2 , transferAmount);
       }

    }

    /*
        Print the object using toString method

        like
         return "\nname: " + name +
                "\npassword: " + password+
                "\ndateOfBirth: " + dateOfBirth+
                ......

     */
    public String toString() {
        return "\nname: " + name +
                "\npassword: " + password+
                "\ndateOfBirth: " + dateOfBirth+
                "\nmarriageStatus: "+ marriageStatus+
                "\naccountNumber: " + accountNumber+
                "\namount in account 1 : " + amountAccount1+
                "\naccountNumber2: " + accountNumber2+
                "\namount in account 2 : " + amountAccount2+
                "\nrelativeName: " + relativeName+
                "\nrelativeAge: " + relativeAge;
   }



}
