package day12_conditional_statements;

public class comparisonExample {
    public static void main(String[] args) {
        int currentSpeed, speedLimit;
        boolean isSpeeding;

        currentSpeed = 45;
        speedLimit = 55;
        isSpeeding = currentSpeed - speedLimit >=0;

        System.out.println("Are you speeding? " + isSpeeding);

    }
}
