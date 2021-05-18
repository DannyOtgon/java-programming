package day24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;
         //video is 1 min 57 sec

        while (seconds <=117){
            System.out.println("Watching youtube video: second: "+ seconds++);
            Thread.sleep(1000);
        }
        System.out.println("Finished watching cat Video, lets start another one");
    }
}
