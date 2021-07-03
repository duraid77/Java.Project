package day59_polymorphism_exceptions;

public class InputField implements WebElement{
    @Override
    public void sendKeys(String txt) {
        System.out.println("sending text at input field");
    }

    @Override
    public void click() {
        System.out.println("click to search");
    }

    @Override
    public void getText() {
        System.out.println("get text written at input field");
    }

    public String getValue(){
        String selenium = "selenium";
        return selenium;
    }
}
