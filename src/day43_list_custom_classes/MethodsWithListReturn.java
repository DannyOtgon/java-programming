package day43_list_custom_classes;

import java.util.*;

public class MethodsWithListReturn {
    /**
     * get IntegerList
     * no params
     * return List<Integer>
     *     Loop frmom o-1000_00
     *     and add to arraylist then return it
     */


    public static void main(String[] args) {
        long start = System.nanoTime();

        List<Integer> mlnNums = getIntegerList();//returns ready ArrayList object. no need to type new ArrayList...
        System.out.println(mlnNums);

        long end = System.nanoTime();
        //System.out.println("ArrayList time = " + (end-start));

        long st = System.nanoTime();
        int [] arrNumsMil = getIntegerArray();
        long en = System.nanoTime();
        double seconds = (en-st) / 1000000000.0;
        System.out.println("Array time = " + (en-st));
        System.out.println("Array time seconds = " + seconds);


    }
    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for (int i=0; i<=1000000; i++){
            nums.add(i);
        }
        return nums;
    }
    public static int[] getIntegerArray() {
        //declare empty array with size 1million
        int [] nums = new int [1000001];
        for (int i=0; i<=1000000; i++){
            nums [i] = i;
        }
        return nums;
    }
}
