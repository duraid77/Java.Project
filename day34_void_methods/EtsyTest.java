package day34_void_methods;

public class EtsyTest {
    public static void main(String[] args) {
    openBrowser();
    navigatToURL();
    searchForWoodenSpoon();
    }
    public static void openBrowser(){
        System.out.println("Launching Chrome browser");
    }
    public static void navigatToURL(){
        System.out.println("Navigating to  https://www.Etsy.com");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("Pass: verify Etsy home page is displayed");
        System.out.println("Type 'Wooden Spoon' in search field and click search");
    }


}
