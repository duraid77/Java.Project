package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(23215445555l);
        acc.setAccountHolder("Duraid");
        acc.setBalance(103266);
        acc.setAccountType("360 checking");

        System.out.println(acc);



    }
}
