package day55_abstraction_Exercise.Interface_demo;

public class ChromeDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("Chrome naviting to Url");
    }

    @Override
    public void findElement(String locator) {
        System.out.println("locate element");
    }

    @Override
    public void quit() {
        System.out.println("close browser");
    }

    @Override
    public String getTitle() {
        return "title";
    }
}
