package day24_loops;



public class unreadSMS {
    public static void main(String[] args) {
        int unreadSMS = 10;
        while (unreadSMS >= 0) {
        System.out.println("You are reading \uD83D\uDC8C number: " + unreadSMS);
        unreadSMS--;
    }
        System.out.println("You have zero unread \uD83D\uDC8C");
    }
}
