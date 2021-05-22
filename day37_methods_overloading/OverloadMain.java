package day37_methods_overloading;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Heppy New Year!");
        main(true);
    }
    public static void main(boolean check) {

        System.out.println(check);
    }
}
