package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("EVEN NUMBERS 0-100: ");

        for (int n=1; n<=100; n++){
            if (n % 2 == 0){
                System.out.print(n + " ");
            }
        }
        System.out.println("\nODD NUMBERS 0-100: ");
        for (int k=0; k<=100; k++){
            if (k % 2 != 0){
                System.out.print(k + " ");
            }
        }
        System.out.print("\n");
        for (int i=0; i<=50; i++){
            if (i % 2 == 0){
                System.out.print(i+",");
            }
        }
        //LISTEN TO YOUR HEART UNTIL YOU HEART STOPS BEATING FOREVA AND EVA AND EVA AND EVA
        for (byte i=11; i<=19;i--){
            System.out.println(i);
        }

    }
}
