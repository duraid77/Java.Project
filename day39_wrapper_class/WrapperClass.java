package day39_wrapper_class;

public class WrapperClass {
    public static void main(String[] args) {
        int num = 100;
        Integer n = new Integer(500);
        System.out.println("is n 500? = " + n.equals(500));

        String numStr = n.toString();
        System.out.println("numStr = " + numStr);
    }
}
