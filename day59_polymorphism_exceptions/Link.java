package day59_polymorphism_exceptions;

public class Link implements WebElement{
    @Override
    public void sendKeys(String txt) {
        System.out.println("Not supported");
    }

    @Override
    public void click() {
        System.out.println("click the link");
    }

    @Override
    public void getText() {
        System.out.println("link text");
    }

    public void getLinkHref(){
        System.out.println("href value for the link");
    }
}
