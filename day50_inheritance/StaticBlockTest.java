package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo staticBlock1 = new StaticBlockDemo(); // static block runs once then constructor runs here
        StaticBlockDemo SB2 = new StaticBlockDemo(); //only constructor running here
        System.out.println(StaticBlockDemo.num);
        StaticBlockDemo sb3 = new StaticBlockDemo(50);
        System.out.println(sb3.num);
    }
}
