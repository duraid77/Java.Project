package day38_methods;

public class MethodCallAnother {
    public static void main(String[] args) {
    start();
    }


    public static void start(){
        System.out.println("Start");
        keepContinue();
    }
    public static void keepContinue(){
        System.out.println("continue");
        end();
    }
    public static void end(){
        System.out.println("end");
    }

}
