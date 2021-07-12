package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();
        Shape circle = new Circle();
        circle.draw();
        Shape square = new Square();
        square.draw();

        System.out.println("----------------------LIST---------------------");

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Circle());

        for (Shape each : shapes) {
            each.draw();
        }

        drawShape(new Circle());
        drawShape(new Square());


        }
    public static void drawShape(Shape shapes){
        System.out.println("----Drawing Shape-----");
        shapes.draw();
    }
}
