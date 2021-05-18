package day42_arraylist;

import day41_arraylist.ArraysAsList;

import java.util.*;

public class MethodsWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium"); words.add("a"); words.add("input"); words.add("title");
        printStrList(words);


        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        int sum = sumIntegerList(nums);
        System.out.println(nums);
        System.out.println(sum);
    }

    public static void printStrList(List<String> stringList) {
        for(String str : stringList){
            System.out.println(str +" ");
        }
    }

    public static int sumIntegerList(List<Integer> integerList){
        int sum = 0;
        for (Integer i : integerList){
            sum+=i;
        }
        return sum;
    }
}
