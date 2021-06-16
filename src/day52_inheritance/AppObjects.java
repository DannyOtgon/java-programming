package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {

        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("Youtube");
        mobileApp.useTheApp(10);
        mobileApp.setVersion(54.5);

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.useTheApp(20);

        Discord discord = new Discord();
        discord.setName("Discord");
        discord.useTheApp(60);

        discord.setVersion(11.12);
        instagram.setVersion(1.01);
        mobileApp.download();
        instagram.download();
        discord.download();
    }
}
