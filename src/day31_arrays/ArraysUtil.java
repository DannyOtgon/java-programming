package day31_arrays;

import java.util.*;

public class ArraysUtil {
    public static void main(String[] args) {

        int nums [] = {100,5,1,7,0,-4,44,33};
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        String [] words = {"Java", "C#", "C++", "Kotlin", "Python", "Ruby", "assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("["+ String.join(", ", words)+"]");

        //sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));

        String [] alphabet = {"A", "B", "C", "D", "E", "F"};
        Arrays.sort(alphabet);
        System.out.println(Arrays.toString(alphabet));
        Arrays.sort(alphabet, Collections.reverseOrder());
        System.out.println(Arrays.toString(alphabet));
        for (String alpha : alphabet){
            System.out.print(alpha+ ", ");
        }


    }
}
