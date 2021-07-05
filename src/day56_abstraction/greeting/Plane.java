package day56_abstraction.greeting;

public class Plane extends Transportation implements SelfDrivable,Greeting{
    @Override
    public void hi() {
        System.out.println("Hi Fly");
    }

    @Override
    public void bye() {
        System.out.println("Bye Fly");
    }

    @Override
    public void autoPilot() {
        System.out.println("Flying Away on APM");
    }

    @Override
    public void transportPeople() {
        System.out.println("Flying People");
    }

    @Override
    public void cost(int mile) {
        System.out.println("plane cost: $" + mile*100 +" to fly " + mile+" miles");
    }
}
