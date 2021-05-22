package day24_loops;

public class loopBackward {
    public static void main(String[] args) throws InterruptedException {
        int count = 5;
        while (count>=0){
            System.out.println("count = " + count);
            Thread.sleep(2000);
            count--;
        }
    }
}
