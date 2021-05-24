package day00_Practicing;

import java.util.*;

public class Practice_AverageNumberArray {
    public static void main(String[] args) {


        int [] nums = {10,5,5,6,4};
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]);
        System.out.println(nums.length);

        int sum =0;
        for (int each: nums){
            sum +=each;
        }
        System.out.println("avg num = " + sum/nums.length);






    }
}
