package day00_Practicing;
import java.util.*;

public class ReplFind55 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {1, 5,5, 1, 1};

        boolean result = false;

        for (int i=0; i<nums.length-1; i++){
            if (nums[i]==5 && nums[i+1]==5){
                result = true;
            }
        }
        System.out.println(result);

            }
        }


