package day55_abstraction_Exercise.Interface_demo;

public class FireFoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver naviting to Url");
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver locate eleminte");
    }

    @Override
    public void quit() {
        System.out.println("close browser");
    }

    @Override
    public String getTitle() {
        return "Title";
    }
}
