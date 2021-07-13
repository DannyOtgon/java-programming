package day59_polymorphism_exceptions;

import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.shapes.Square;

public class InstanceOf {
    public static void main(String[] args) {

        //instance of operator
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);

        if (shape instanceof Circle){
            System.out.println("It is a Circle object");
        }else if (shape instanceof Square){
            System.out.println("It is a Square object");
        }

        System.out.println("-------------------------------------------");
        //java reflection API
        System.out.println(shape.getClass().getSimpleName());


    }
}
