package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(10);

        int amount = 19;
        count(amount);

        String word = "wooden spoon";
        count(word.length());

        printAge(1991);

    }
    public static void count (int num){
        for (int i=0; i<=num; i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void printAge(int year){
        int age = 2021 - year;
        System.out.println("birth year: " +year+". Age: "+age);
    }
}
