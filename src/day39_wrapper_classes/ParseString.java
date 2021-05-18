package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        /**
         * convert String  -> Number by using parse or valueof methods in wrapper classes.
         */

        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);

        String setPrice = "123.5";
        double price = Double.parseDouble(setPrice);
        if (price > 100) {
            System.out.println("expensive");
        }

        //SEPERATE & PRINT ONLY 100 AND CONVERT TO PRIMITIVE
        String sentence = "I wrote 100 lines of code";
        String [] words = sentence.split(" ");
        int linesOfCode = Integer.parseInt(words[2]);
        System.out.println("lines of code: " + linesOfCode);


    }
}
