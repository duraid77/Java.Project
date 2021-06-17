package day54_abstraction;

public class MenueObjects {
    public static void main(String[] args) {

        Salad salad = new Salad();
        Pizza pizza = new Pizza();

        salad.prepare();
        salad.serve();

        pizza.prepare();
        pizza.serve();
    }
}
