package day53_inheritance.hiding;

public class Mobile extends Phone{
    String type = "mpbile phone";


    public static void use(){
        System.out.println("using mobile phone");
    }

    public void text(){
        use();
        System.out.println("and making a phone call");
    }
}
