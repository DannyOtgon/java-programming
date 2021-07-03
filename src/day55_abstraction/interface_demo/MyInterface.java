package day55_abstraction.interface_demo;

public interface MyInterface {
          void learn();

}

interface MyInterface2{

}

class Myclass implements MyInterface, MyInterface2 {

    @Override
    public void learn() {
        System.out.println("learning in MyClass");
    }
}

class Main{
    public static void main(String[] args) {
        //MyInterface myInterface = new MyInterface();    --> Abstract class can not create create object of
        Myclass myclass = new Myclass();

    }
}