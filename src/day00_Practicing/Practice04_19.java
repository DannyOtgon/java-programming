package day00_Practicing;

import java.util.*;

public class Practice04_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below.
        //Create another loop for your solution!
        for (int b=0; b<arr.length; b++){
            System.out.print(arr[b].charAt(0));
            System.out.print(arr[b].charAt(1));
            System.out.print(arr[b].charAt(2));
            System.out.println();
        }
    }
}
