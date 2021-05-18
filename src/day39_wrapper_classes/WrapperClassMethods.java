package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(5,2));
        System.out.println("MIN Integer: " + Integer.MIN_VALUE);
        System.out.println("MAX Integer: " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.4,88.69));

        System.out.println("Compare Nums: " + Double.compare(45,5)); // 1st large then --> 1
        System.out.println("Compare Nums: " + Double.compare(5,5)); // both equal -->   0
        System.out.println("Compare Nums: " + Double.compare(5,45)); // 2nd large then --> -1

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('v'));

        char letter = 'A';
        if (Character.isUpperCase(letter)){
            System.out.println("its uppercase");
        }
        String word = "JaVa iS FuN";
        for (int i=0; i<word.length(); i++){
            if (Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i));
            }
        }
        System.out.println("========================================================================================");
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);

    }
}
