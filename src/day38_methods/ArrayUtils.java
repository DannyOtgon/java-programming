package day38_methods;

public class ArrayUtils {

    public static void printArray(int [] nums){
        for (int num : nums){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static int sum (int[] nums){
        int sum =0;
        for (int i=0; i<nums.length; i++){
            sum += nums[i];

        }
        return sum;
    }
    public static boolean contains (int [] nums, int num){
        for (int i=0;i<nums.length;i++){
            if (nums[i] == num){
                System.out.println(nums[i]+"matches"+num);
                return true;
            }
        }
        return false;
    }
}
