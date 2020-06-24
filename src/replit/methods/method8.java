package replit.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class method8 {


    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("sayi gir");
        String[] sayigir = oku.nextLine().split(" ");
        System.out.println("sayi gir");
        String[] sayigir2 = oku.nextLine().split(" ");
        int[] nums1 = new int[sayigir.length];
        int[] nums2 = new int[sayigir2.length];
        for (int i = 0; i < sayigir.length; i++) {
            nums1[i] = Integer.parseInt(sayigir[i]);
        }
        for (int i = 0; i < sayigir2.length; i++) {
            nums2[i] = Integer.parseInt(sayigir2[i]);
        }

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));

    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2){

        int[] numsRet = new int[nums1.length];
        Arrays.fill(numsRet, -1);

        for (int i=0; i<nums1.length; i++){

            for (int j=0; j<nums2.length-1; j++){

                if (nums1[i] == nums2[j] && nums2[j] < nums2[j+1]){
                    numsRet[i]=nums2[j+1];
                    break;
                }
            }
        }
        return numsRet;
    }}

