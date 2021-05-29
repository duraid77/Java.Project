package day48_constructors_static;

public class BusObjects {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver= new Driver("Abbas");
        bus.engine=new Engine("Cummins 12 cylender");
        System.out.println(bus.toString());

        Bus metroBus = new Bus();
        metroBus.driver.setName("Aziz");
        metroBus.engine.setCylinder("MAN 18 cylender");

        System.out.println(metroBus.driver.getName());

    }
}
