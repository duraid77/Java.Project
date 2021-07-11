package day61_exceptions_collections;

public class BreakTimeExceptionTest {
    public static void main(String[] args) {
        int minutes = 60;
        minutes= 70;

        if (minutes>60){
            throw new BreakTimeException("Time to take a break");
        }
    }
}
