package day48_constructor_static;


import java.sql.Driver;

public class Bus {
    Driver driver;
    Engine engine;


    public String toString() {
        return driver.getName() +" | "+ engine.getCylinders();
    }
}
