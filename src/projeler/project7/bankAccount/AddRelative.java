package bankAccount;

public class AddRelative {

    /*
    Create an instance variable
        String fullName , age
     */
    String fullName;
    String age;

    /*
        Create a constructor AddRelative
            parameters String fullName and age

        instance variable fullName equal to parameter fullName

        If the age is more then or equal to 18 then instance variable age equal to parameter age (use relativeAgeChecker method)
        If the age is less then 18 then instance variable age equal to "0"

     */
    public AddRelative(String fullName, String age) {
        this.fullName = fullName;
        boolean res = relativeAgeChecker(age);
        if (res == true) {
            this.age = age;
        } else {
            this.age = "0";
        }
    }

    /*
        Create a method name is relativeAgeChecker
        parameter string(relativeAge)
        return type is boolean

        if the relativeAge more or equal to 18 then return true
        else false

        Note: use a Users class checkAge method.
     */

    public boolean relativeAgeChecker(String relativeAge) {
        String result = Users.checkAge(relativeAge);
        return result.equals("You can get a credit card");
    }
}
