package day58_polymorphism;

public class Superman extends Father implements Worker {

    @Override
    public void work(String job) {
        System.out.println("Superman is working as "+job);
    }

    @Override
    public double getPaid(double Salary) {
        System.out.println("Superman is getting paid $"+Salary);
        return Salary;
    }
}