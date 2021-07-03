package day59_polymorphism_exceptions;

public class ElementsTest {
    public static void main(String[] args) {
        WebElement loginLink = new Link();
        loginLink.click();
        loginLink.getText();
        loginLink.sendKeys("easy");

        WebElement username = new InputField();
        username.click();
        username.sendKeys("hello");
        username.getText();

        WebElementUtil.clickElement(username);
        WebElementUtil.clickElement(loginLink);

        WebElement login = WebElementUtil.getLinkWithText("login");
        login.click();



    }
}
