package day52_inheritance;

public class Discord extends MobileApp{

    @Override
    public void useTheApp(int minutes){
        System.out.println("Using Discord for " + minutes + "for chatting");
        super.useTheApp(35);
    }
    public void chat(String someone){
        System.out.println("Chatting with " + someone);
    }

    public void printInfo(){
        System.out.println("App name = " + getName());
        System.out.println("Version = " + getVersion());
    }
}
