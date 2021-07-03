package day59_polymorphism_exceptions;

public class ElementsTest {
    public static void main(String[] args) {
        WebElement loginLink = new Link();
        loginLink.click();
        loginLink.getText();
        loginLink.sendKeys("easy");
    }
}
