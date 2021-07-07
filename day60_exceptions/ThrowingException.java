package day60_exceptions;

import java.util.InputMismatchException;

public class ThrowingException {
    public static void main(String[] args) {
        System.out.println("Lets create exception");
        RuntimeException e = new RuntimeException();
       // throw e;
        throw new InputMismatchException();
    }

}
