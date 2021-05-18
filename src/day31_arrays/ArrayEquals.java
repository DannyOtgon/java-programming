package day31_arrays;

import java.util.*;

public class ArrayEquals {
    public static void main(String[] args) {

        int[] nums1 = {4, 5, 2, 10};
        int[] nums2 = {4, 5, 2, 10};
        int[] nums3 = {10, 4, 5, 2};
        int[] nums4 = {4, 5, 2, 10, 90};
        int[] nums5 = {54, 23, 54, 123, 54};
        String[] cars1 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String[] cars2 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String[] cars3 = {"toyota", "honda", "tesla", "bmw", "dodge"};
        String[] cars4 = {"Toyota", "Honda", "Tesla"};

        System.out.println("nums1 == nums2 : " + Arrays.equals(nums1, nums2));
        System.out.println(nums1 == nums2); // this won't work!

        if (Arrays.equals(cars1, cars2)) {
            System.out.println("They match");
        } else {
            System.out.println("They don't match");
        }
        if (Arrays.equals(cars2, cars3)) {             //dont'match because Case Sensitive
            System.out.println("They match");
        } else {
            System.out.println("They don't match");


        }
//THEN YOU CAN TURN CASE SENSITIVE OFF LIKE THIS:
        if (Arrays.toString(cars2).equalsIgnoreCase(Arrays.toString(cars3))) {
            System.out.println("They match, but case sensitive (off)");
        } else {
            System.out.println("They don't match");
        }
    }
}
