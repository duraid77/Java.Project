package day61_exceptions_collections;

public class InsufficientExceptionTest {
    public static void main(String[] args) {
        double Balance = 499.99;
        double itemPrice = 600.99;

        if( itemPrice > Balance){
            throw new InsufficientBalanceException("You don't have enough money");
        }
    }
}
