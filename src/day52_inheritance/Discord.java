package day52_inheritance;

public class Discord extends MobileApp {
    public void chat(String someone){
        System.out.println("Chatting on Discord with " + someone);
    }

    @Override
    protected boolean download() {
        System.out.println("Downloaded Discord 0.0.23 from App Store");
        return true;
    }

    @Override
    public void useTheApp (int minutes){
        super.useTheApp(minutes);
        System.out.println("Using the app "+ getName() +" for " + minutes + " minutes ");
    }
}
