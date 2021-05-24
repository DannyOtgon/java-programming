package day00_Practicing;
import java.util.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice_100numberArray {
    public static void main(String[] args) {

        int [] nums = new int[100];
        System.out.println(nums.length);
        for (int i=0; i<nums.length; i++){
            nums[i]=i+1;
            System.out.println(nums[i]);
        }
        System.out.println("nums at 99 = " + nums[99]);


        //find a program to find min & max number
        int minValue = nums[0];
        int maxValue = nums [0];

        for (int i=0; i<nums.length; i++){
            if (nums[i]<minValue){
                minValue = nums[i];

            }
            if (nums[i]>maxValue){
                maxValue = nums[i];

            }
        }
        System.out.println("min value: "+minValue);
        System.out.println("max value: "+maxValue);


        System.out.println("====================================================================");
        int sum =0;
        for (int each: nums){
            sum +=each;
        }
        System.out.println("sum = " + sum);
        System.out.println("avg num = " + sum/nums.length);

        Arrays.sort(nums);
        System.out.println("MINIMUM VALUE AFTER SORT: " + nums[0]);
        System.out.println("MAX VALUE AFTER SORT: " + nums[nums.length-1]);

    }
}
