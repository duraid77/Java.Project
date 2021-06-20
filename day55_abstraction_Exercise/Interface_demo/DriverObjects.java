package day55_abstraction_Exercise.Interface_demo;

public class DriverObjects {
    public static void main(String[] args) {
        ChromeDriver driver1 = new ChromeDriver();
        FireFoxDriver driver2 = new FireFoxDriver();
        WebDriver driver3= new ChromeDriver();

        driver1.getTitle();
        driver1.findElement("Amazon");
        driver1.quit();

        driver2.get("amazon.com");
        driver3.findElement("by ID");



    }
}
