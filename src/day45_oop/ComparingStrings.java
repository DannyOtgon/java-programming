package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "java";

        String word3 = new String("java");
        String word4 = new String("java");

        System.out.println(word1==word2);
        System.out.println(word1==word3);
        System.out.println(word3==word4);
    }
}
