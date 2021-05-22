package day36_custom_methods_with_return;

import java.util.Random;

public class returnName {
    public static void main(String[] args) {
        System.out.println(fullName());
        System.out.println("Is he Married" + isMarried());
        System.out.println(getAge());
        System.out.println("Random Year = " + getRandomYear());


    }



    public static String fullName(){
        return "Mike Smith";
    }
    public static boolean isMarried(){
        return true;
    }
    public static int getAge(){
        return 35;
    }
    public static int getRandomYear(){
       Random rand = new Random();
       int randomYear;
       do {
           randomYear = rand.nextInt(2022);
       }while (randomYear < 1940);
       return randomYear;
    }
}
