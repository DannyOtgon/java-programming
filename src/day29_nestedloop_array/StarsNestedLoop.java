package day29_nestedloop_array;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int b = 1; b <= 10; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n======================================================");

        for (int i = 1; i <= 10; i++) {
            for (int b = 10; b >= i; b--) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
