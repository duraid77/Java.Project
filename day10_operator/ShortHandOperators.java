package day10_operator;

public class ShortHandOperators {
    public static void main(String[] args){
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars +=2;
        System.out.println("cars = " + cars);
        cars +=5;
        System.out.println("cars = " + cars);
        cars -= 6;
        System.out.println("cars = " + cars);
        int electricCars = 13;
        cars += electricCars;
        System.out.println("cars = " + cars);

        String word = "Java";
        word = word + " Programming";
        System.out.println("word = " + word);
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but selenium is more fun.";
        word += selenium;
        System.out.println("word = " + word);

        word += 12345;
        System.out.println("word = " + word);

        char letter ='A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        letter += 'J';
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parking fee= $" + parkingFee);
        //Early bird parking fee is 50% off
        parkingFee /= 2;
        System.out.println("parkingFee = " + parkingFee);
        parkingFee -= parkingFee;
        System.out.println("parkingFee = " + parkingFee);




    }
}
