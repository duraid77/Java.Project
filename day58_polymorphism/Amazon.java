package day58_polymorphism;

public class Amazon extends OnlineShop implements Prime{

    @Override
    public void buy() {
        System.out.println("Buy from Amazon");
    }

    @Override
    void sell() {
        System.out.println("\"Sell on Amazon\"");

    }

    @Override
    void ship() {
        System.out.println("Sold and shipped by Amazon");
    }

    @Override
    public void primeShipping() {
        System.out.println("Prime shipping two days delivery");
    }
}
