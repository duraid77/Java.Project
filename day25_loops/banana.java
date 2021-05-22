package day25_loops;

public class banana {
    public static void main(String[] args) {
        int bananas = 0;
        int countToFull = 3;
        boolean isHungry = true;
        while (isHungry){
            System.out.println("Eat one banana");
            countToFull--;
            if(countToFull==0){
                isHungry = false;
            }
        }
    }
}
