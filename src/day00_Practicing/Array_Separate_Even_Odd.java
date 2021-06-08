package day00_Practicing;

import java.util.*;

public class Array_Separate_Even_Odd {
    public static void main(String[] args) {

        //separate the even and odd numbers from Array and assign them to separate Arrays

        int [] nums = {2,3,6,7,11,12,19,20,21};
        System.out.println(nums[0]);

        int even = 0;
        int odd = 0;

        for (int each : nums) {
            if (each%2==0){
                even++ ;
            }else{
                odd++ ;
            }

        }
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);
        
        int [] evenNums = new int[even];
        int [] oddNums = new int[odd];

        for (int i = 0, e=0, o=0; i<nums.length;  i++) {
            if (nums[i] % 2 == 0){
                evenNums[e++] = nums[i];
            }else{
                oddNums[o++] = nums[i];
            }
            
        }

        System.out.println("evenNums = " + Arrays.toString(evenNums));
        System.out.println("oddNums = " + Arrays.toString(oddNums));
        System.out.println(evenNums[evenNums.length-1]);


    }
}
