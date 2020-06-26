package projeler.haziran26;

public class getPopulation {

    /*
        Method name is populationOfCountry
        This method will get 1 String array(countryNames) 1 int array (countryPopulations) and 1 String (str)
        countryNames is Country name
        countryPopulations is Country population
        if str is contained in the countryNames return the population


        For example:
        countryNames = {"USA" ,"Mexico" ,"Canada"}
        countryPopulations = {100000 , 120000 , 130000}
        str = "Mexico"
        return should be 120000

        NOTE : if str is not in the countryNames array return -1

     */

    public int populationOfCountry(String[] countryNames, int[] countryPopulations, String str) {
        int pop = -1;
        for (int i = 0; i < countryNames.length; i++) {
            if (countryNames[i].equals(str)) {
                pop = countryPopulations[i];
            }
        }

        return pop;
    }


}
