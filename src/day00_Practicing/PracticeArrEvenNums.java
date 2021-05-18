package day00_Practicing;

import java.util.*;

public class PracticeArrEvenNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below

        int evenNums = 0;
        for (int i=0; i<nums.length;i++){
            if (nums[i] % 2 == 0){
                evenNums ++;
            }
        }
        System.out.println(evenNums);
    }
}
