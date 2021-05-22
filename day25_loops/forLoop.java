package day25_loops;

public class forLoop {
    public static void main(String[] args) {
        String myStars = "";
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            myStars += "*";
        }
        System.out.println("myStars = " + myStars);
    }
}
