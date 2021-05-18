package day43_list_custom_classes;

import java.util.*;

public class ListMethods {
    public static void main(String[] args) {
        List <String> dayNames = getDays();
        System.out.println(dayNames);

        dayNames.removeIf(day -> day.length() == 6);
        System.out.println("dayNames after removeIf = " + dayNames);


        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n < 90); //remove nums less than 90
        System.out.println("nums = " + nums);




    }
    public static List<String> getDays(){
        List<String> days = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        return days;
    }
    /**
     * get random list
     * param: int size
     * return value : List of Integers
     * generate random numbers
     */
    public static List<Integer> getRandomList(int size){
        Random random = new Random ();       //setting new random object with limit 0-100 limit
        List <Integer> nums = new ArrayList<>();
        for (int i=1; i<=size; i++){
            nums.add(random.nextInt(101));         //generate random numbers and add to list
        }
        return nums;
    }
}
