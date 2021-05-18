package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for (int stars = 1; stars <= 15; stars++){
            System.out.print("*☆ ");
        }

        System.out.println();              // go to next line because line 6 doesn't have LN
        String myStars = "";               // assign empty value to mystars
        for (int i = 1; i<=5; i++){         //we are saying add * five times because its FOR LOOP (must know how many times
            myStars += "* ";                //everytime for loop value is true, add * to myStars value
        }
        System.out.println("myStars = " + myStars.trim());
    }
}
