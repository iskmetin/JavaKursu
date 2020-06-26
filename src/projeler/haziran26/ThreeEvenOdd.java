package projeler.haziran26;

public class ThreeEvenOdd {

    /*

    Given an int array as a parameter
    return true if the array contains either 3 even numbers or 3 odd numbers .

    for Example:

    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true

     */

    public boolean threeEvenOrOdd(int[] intArr) {

        int count = 0;
        int count1 = 0;
        for (int i : intArr) {
            if (i % 2 == 0) {
                count++;
            }
            if (i % 2 != 0) {
                count1++;
            }
        }
/*
*** alternatif****
boolean sonuc=;
if(count==count1){
    sonuc=true;
}
else{
sonuc= false;
}
return sonuc;

 */
        return count == 3 || count1 == 3;
    }

}
