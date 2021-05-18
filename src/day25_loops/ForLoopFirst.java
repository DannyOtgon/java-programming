package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i<=5; i++){
            System.out.println("Java is fun!");
        }

        for(int i=1; i <= 10; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }

    }
}
