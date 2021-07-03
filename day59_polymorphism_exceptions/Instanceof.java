package day59_polymorphism_exceptions;

import day57_abstraction_polymorphism.Shape;
import day57_abstraction_polymorphism.Triangle;
import day57_abstraction_polymorphism.ploymorphism.Circle;

public class Instanceof {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Triangle);

        if(shape instanceof Circle){
            System.out.println("It is a circle");
        }else if( shape instanceof Triangle){
            System.out.println("it is a triangle");
        }



        //java reflection API

        System.out.println(shape.getClass().getSimpleName());
        System.out.println(shape.getClass().getName());

        if(shape.getClass().getSimpleName().equals("Circle")){
            System.out.println("it is a circle class");
        }


        WebElement el = new Link();
        System.out.println(el.getClass().getSimpleName());// will print Link not WebElement


    }
}
