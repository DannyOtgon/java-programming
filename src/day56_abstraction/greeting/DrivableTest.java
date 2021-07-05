package day56_abstraction.greeting;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.hi();
        model3.transportPeople();
        model3.autoPilot();
        model3.cost(25);
        model3.start();
        model3.stop();

        Plane plane = new Plane();
        plane.autoPilot();
        plane.bye();
        plane.hi();
        plane.cost(250);
        plane.start();
        plane.stop();
        plane.transportPeople();
    }

}
