package day40_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(45);
        nums.add(1);
        nums.add(8);
        nums.add(23);
        nums.add(12);

        System.out.println(nums);
        System.out.println("size = " + nums.size());
        System.out.println("index 0 = " + nums.get(0));
        System.out.println("index 4 = " + nums.get(4));

        nums.remove(1);
        System.out.println("after revise = " + nums);

    }
}
