package day00_Practicing;

import java.util.*;

public class ReplArrNonduplicate {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

    for (int i=0; i<nums.length; i++){
        int count =0;
        for (int each : nums){
            if (each ==nums[i]){
                count++;
            }
        }
        if (count==1){
            System.out.println("Non duplicate number: " + nums[i]);
        }
    }
}
}

