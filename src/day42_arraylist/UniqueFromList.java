package day42_arraylist;

import java.util.*;

public class UniqueFromList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,4,1,1,5,6,0,6));
        System.out.println(nums);

        List<Integer> uniqueList = getUniqueIntegers(nums);

        System.out.println("\nUnique List: " + uniqueList);



    }

    private static List<Integer> getUniqueIntegers(List<Integer> nums) {
        List<Integer> uniqueList = new ArrayList<>();    // loop thru and find the unique numbers and add it to uniqueList
//FIND THE UNIQUE NUMBERS THAT DOESN'T REPEAT IN ABOVE ARRAY LIST
        for (int unique : nums){
            if (Collections.frequency(nums,unique)==1) {
                System.out.print(unique + " ");
                uniqueList.add(unique);
            }
        }
        return uniqueList;
    }
}
