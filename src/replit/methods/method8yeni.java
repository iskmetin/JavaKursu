package replit.methods;

import java.util.Arrays;
import java.util.Scanner;

public class method8yeni {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("sayi gir");
        String[] sayigir = oku.nextLine().split(" ");
        System.out.println("sayi gir");
        String[] sayigir2 = oku.nextLine().split(" ");
        int[] nums1 = new int[sayigir.length];
        int[] nums2 = new int[sayigir2.length];
        for (int i = 0; i < sayigir.length; i++) {
            nums1[i] = Integer.valueOf(sayigir[i]);
        }
        for (int i = 0; i < sayigir2.length; i++) {
            nums2[i] = Integer.valueOf(sayigir2[i]);
        }

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] yenidizi = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int max = nums1[i];
            for (int a = 0; a < nums2.length; a++) {
                if (nums1[i] == nums2[a]) {

                    if (a == (nums2.length - 1)) {
                        yenidizi[i] = -1;

                    } else {
                        for (int x = a; x < nums2.length; x++) {
                            if (nums2[x] > max) {
                                max = nums2[x];
                                break;
                            }

                        }
                        if (max > nums1[i]) {
                            yenidizi[i] = max;
                        } else {
                            yenidizi[i] = -1;
                        }
                    }
                }
            }
        }
        return yenidizi;
    }
}


