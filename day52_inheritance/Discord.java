package day52_inheritance;

public class Discord extends MobileApp{

    @Override
    public void useTheApp(int minutes){
        System.out.println("Using Discord for " + minutes);
    }
    public void chat(String someone){
        System.out.println("Chatting with " + someone);
    }
}
