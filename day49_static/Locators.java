package day49_static;

public class Locators {
    public static void main(String[] args) {
    BankAccount husband = new BankAccount();
    husband.user = "cybertek";
    husband.spend(150);
    husband.showBalance();

    BankAccount wife = new BankAccount();
    wife.showBalance();
    wife.spend(250);
    husband.showBalance();
    }
}
