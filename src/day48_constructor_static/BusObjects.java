package day48_constructor_static;

public class BusObjects {
    public static void main(String[] args) {


        Bus bus = new Bus();
        bus.driver = new Driver("Mike");
        bus.engine = new Engine(10);

        System.out.println(bus);

        Bus metroBus = new Bus();
        metroBus.driver = new Driver("Cam");
        metroBus.engine = new Engine(8);

        System.out.println(metroBus);

        //print driver name of metroBus
        System.out.println(metroBus.driver.getName());



    }
}
