package day61_exceptions_collections.errors;

public class CheckedExceptionDemo {
    public static void main(String[] args)  {
        System.out.println("About to sleep for 5 seconds");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
