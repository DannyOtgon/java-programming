package day52_inheritance;

public class Instagram extends MobileApp {
    public void postPhoto(){
        System.out.println("Posting photo on Instagram");
    }

    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        System.out.println("Using Instagram app for " + minutes + " minutes");
    }
}
