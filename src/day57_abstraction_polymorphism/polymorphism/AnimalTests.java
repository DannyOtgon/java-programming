package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {

    public static void main(String[] args) {
        Animal a1 = new Animal();  // this is not polymorphism, data type and object type are SAME
        a1.makeNoise();

        //Polymorphism Way below
        Animal animal1 = new Dog();
        Animal animal2 = new Horse();
        Animal animal3 = new Cat();
        Animal a4 = new Dog();

        System.out.println("-------------------------------LIST-----------------------------------------");

        List <Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Cat());
        listOfAnimals.add(new Horse());

        for (Animal each : listOfAnimals) {
            each.makeNoise();
        }


    }

}
