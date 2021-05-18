package day41_arraylist;

import java.util.*;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = " + nums);
        //nums.add(100);


        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);                              //this removes the number at index 0
        System.out.println(numsList);
        numsList.remove(new Integer(23));
        System.out.println(numsList);                    //this removes the number

        /**
         * list string drinksWithCaffeine --> coffee,tea,monster,red bull, coke, pepsi, mdew, kambucha, celsius
         */
        System.out.println("=========================================================================================");
        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "pepsi", "mdew", "kambucha", "celsius"));

        for (int i = 0; i < drinksWithCaffeine.size(); i++) {
            if (drinksWithCaffeine.get(i).equals("monster") || drinksWithCaffeine.get(i).equals("red bull") || drinksWithCaffeine.get(i).equals("celsius")) {
                System.out.println("CaffeineAmount = 150  --> " + drinksWithCaffeine.get(i));
            } else if (drinksWithCaffeine.get(i).equals("coffee") || drinksWithCaffeine.get(i).equals("kumbacho")) {
                System.out.println("CaffeineAmount = 100  --> " + drinksWithCaffeine.get(i));
            } else if (drinksWithCaffeine.get(i).equals("tea") || drinksWithCaffeine.get(i).equals("coke")) {
                System.out.println("CaffeineAmount = 50  --> " + drinksWithCaffeine.get(i));
            }


        }
        System.out.println("-------------------------------------------------------------------------");
        int caffeineAmount =0;
        for(String drink : drinksWithCaffeine) {
            switch(drink) {
                case "monster": case "red bull": case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink +" --> " +caffeineAmount);
                    break;
                case "coffee": case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink +" --> " +caffeineAmount);
                    break;
                case "tea": case "coke": case "pepsi": case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink +" --> " +caffeineAmount);
                    break;
            }
        }
        System.out.println("==============================================================");

        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));

        drinksWithCaffeine.forEach(each -> {
            System.out.println("-------");
            System.out.println("each = " + each);
            System.out.println("-------");
        });
    }
}
