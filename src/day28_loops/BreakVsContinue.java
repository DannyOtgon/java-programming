package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
        /**
         * BREAK; can be used with Loops & Switch (will exit loop once statement matches)
         * CONTINUE: can be used only inside LOOPs
         */

        for (int n = 1; n <= 5; n++) {
            if (n==2 || n ==4){
                continue;
            }
            System.out.print(n);

        }
    }
}
