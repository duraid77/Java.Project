package day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrtuvwxyz0123456789_!@#$%^&*";
        Random rand = new Random();
        //rand.nextInt();
        String password ="";
        for (int i=1 ; i<=8; i++){
        int index = rand.nextInt(source.length());
            password += source.charAt(index);
        }
        System.out.println("password = " + password);
        main(null);
    }
}
