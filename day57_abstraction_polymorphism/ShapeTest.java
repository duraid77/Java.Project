package day57_abstraction_polymorphism;

import day57_abstraction_polymorphism.ploymorphism.Circle;

public class ShapeTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape circle = new Circle();

        circle.draw();
    }
}
