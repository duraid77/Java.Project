package day19_class_vs_object;

public class websiteCheck {
    public static void main(String[] args) {
        String website = "Amazon.ru";

        if(website.endsWith(".com")){
            System.out.println("US website");
        }else if(website.endsWith(".ru")){
            System.out.println("Russian website");
        }else if(website.endsWith("gov")){
            System.out.println("government website");
        }else if(website.endsWith(".edu")){
            System.out.println("Education Website");
        }else if(website.endsWith(".org")){
            System.out.println("Organization Website");
        }
    }
}
