package day59_polymorphism_exceptions.exception_handling;

public class SwallowingException {
    public static void main(String[] args) {
        try{
            System.out.println("Hello");
            System.out.println(10/0);
        }catch (Exception ignore){}
            System.out.println("How are you today");
            System.out.println("We just supressed/ swallowed  the runtime exception");
            System.out.println("Error is not reported, we just ignore it");
        }
    }

