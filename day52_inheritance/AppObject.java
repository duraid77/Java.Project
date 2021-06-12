package day52_inheritance;

public class AppObject {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("youtube");
        mobileApp.useTheApp(20);

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.useTheApp(30);
        instagram.setVersion(5.3);
        instagram.download();

        Discord b22discord = new Discord();
        b22discord.setName("Discord");
        b22discord.setVersion(3.365);
        b22discord.useTheApp(20);
        b22discord.download();


    }

}
