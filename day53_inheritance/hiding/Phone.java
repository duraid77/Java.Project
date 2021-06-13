package day53_inheritance.hiding;

public class Phone {
    String type = "old school phone";

    public static void use(){
        System.out.println("Using the phone");

    }

    public void call(){
        use();
        System.out.println("using the phone to make a call");
    }
}
