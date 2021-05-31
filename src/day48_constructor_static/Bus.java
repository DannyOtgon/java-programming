package day48_constructor_static;


import java.sql.Driver;

public class Bus {
    Driver driver;
    Engine engine;

    @Override
    public String toString() {
        return "Bus{" +
                "driver=" + driver +
                ", engine=" + engine.getCylinders() +
                '}';
    }
}
