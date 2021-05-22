package day29_nestedLoop_arrays;

public class NestedForLoop {
    public static void main(String[] args) throws InterruptedException {
        for(int min=0; min <=5; min++){

            for (int sec=1; sec<60; sec++){
                System.out.println( min + ":" + sec );
                Thread.sleep(100);
            }
        }
    }
}
