package day27_loops;

public class Neighbors {
    public static void main(String[] args) {

        String word = "jaavva";
        for (int i = 0; i < word.length()-1; i++) {
            System.out.print(word.charAt(i));
            System.out.println(word.charAt(i+1));
            if (word.charAt(i) == word.charAt(i+1)){
                System.out.println("beep - " + word.charAt(i));
            }

        }
        System.out.println("======================PRACTICE======================");
        String name = "koobee";
        for (int i = 0; i<name.length()-1; i++){
            System.out.print(name.charAt(i));
            System.out.println(name.charAt(i+1));
            if (name.charAt(i) == name.charAt(i+1)){
                System.out.println("beep - " + i);
            }
        }

    }
}