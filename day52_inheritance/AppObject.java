package day52_inheritance;

public class AppObject {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.name = "youtube";
        mobileApp.useTheApp(20);

        Instagram instagram = new Instagram();
        instagram.name = "Instagram";
        instagram.useTheApp(30);

    }

}
