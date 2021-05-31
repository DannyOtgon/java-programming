package day48_constructor_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {

        //static method can be called using Classname.staticMethodName
        //Since .add is a static method you can call it without creating any object
        Calculator.add(5,3);


        //.calculator method is not Static -> its a object method so you have to create to object to call it
        Calculator calcObject = new Calculator();
        calcObject.multiply(5,3);

        //static method can also be called using object
        calcObject.add(5,5);

    }
}
