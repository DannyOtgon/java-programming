package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB {

    @Override
    public void absMethodA() {
        System.out.println("abs Method A is called");
    }
    @Override
    public void methodB(){
        System.out.println("methodB overridden version is called");
    }
    public static void staticMethodC(){
        System.out.println("staticMethodC hidden vefrsion is called");
    }

    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD Overridden version is called "+ num);
    }


}
