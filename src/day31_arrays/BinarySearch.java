package day31_arrays;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums,23));
        System.out.println(Arrays.binarySearch(nums,2344));
        System.out.println(Arrays.binarySearch(nums,14421));
        System.out.println(Arrays.binarySearch(nums,14422));

        //write if statement --> if #12345 is among numbers in array

        if (Arrays.binarySearch(nums,12345) >=0){
            System.out.println(" present in array");
        }
    }
}
