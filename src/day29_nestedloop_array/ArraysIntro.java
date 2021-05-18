package day29_nestedloop_array;

public class ArraysIntro {
    public static void main(String[] args) {
        int [] nums = new int [3];
        nums[0]=5;
        nums[1]=10;
        nums[2]=7;
        System.out.println("index 0 = " +nums[0]);
        System.out.println("index 0 = " +nums[1]);
        System.out.println("index 0 = " +nums[2]);

        int i = 0;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]);

        //HOW TO FIND SIZE OF ARRAY
        System.out.println("number of elements = " + nums.length);
        int len = nums.length;
        System.out.println("len = " + len);

        //change values in the array
        nums[0] = 100;
        nums [1] = 300;
        nums [2] = nums [1];
        System.out.println("nums [0] = " + nums[0]);
        System.out.println("nums [1] = " + nums[1]);
        System.out.println("nums [2] = " + nums[2]);

    }
}
