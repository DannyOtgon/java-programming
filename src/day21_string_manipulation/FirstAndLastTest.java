package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "MOM";
        char first = word.charAt(0);
        char third = word.charAt(2);
        if (first == third){
            System.out.println("first and last letter match");
        }else{
            System.out.println("first and last letters mismatch");
        }

        String anotherWord = "aziza";
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(4);
    }
}
