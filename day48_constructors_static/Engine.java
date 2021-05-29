package day48_constructors_static;

public class Engine {
    String cylinder;

    public Engine(String cylinder){
    this.cylinder = cylinder;
    }

    public String getCylinder() {
        return cylinder;
    }

    public void setCylinder(String cylinder) {
        this.cylinder = cylinder;
    }
}
