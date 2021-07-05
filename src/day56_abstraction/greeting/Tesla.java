package day56_abstraction.greeting;

public class Tesla extends Transportation implements SelfDrivable , Greeting{
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs " + (mile * 0.1) + "to drive" + mile+ " miles");
    }

    @Override
    public void autoPilot() {
        System.out.println("Tesla is driving autonomous mode");
    }

    @Override
    public void hi() {
        System.out.println("Tesla saying hi");
    }

    @Override
    public void bye() {
        System.out.println("tesla saying bye");
    }
}
