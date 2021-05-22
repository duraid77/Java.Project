package day44_custom_classes;

public class MyApps {
    public static void main(String[] args) {
        App app1 = new App();
        app1.name = "Google maps";
        app1.version = "6.11";
        app1.open(app1.version, app1.name);
    }
}
