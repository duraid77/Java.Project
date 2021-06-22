package day56_abstraction.greeting;

public class GreetingAction {
    public static void main(String[] args) {
        MontainLanguage ml = new MontainLanguage();
        ml.hi();
        ml.bye();

        Greeting gt = new MontainLanguage();
        gt.hi();
        gt.bye();

        Japanese jp = new Japanese();
        jp.hi();
        jp.bye();

        gt = new Japanese();
        gt.hi();
        gt.bye();


    }
}
