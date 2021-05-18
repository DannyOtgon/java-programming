package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.type = "Gazelle";
        System.out.println(animal.type);
        animal.eat("grass");
        animal.speak("Meow");

        System.out.println("=================================================================");

        Animal cheetahObj = new Animal();
        cheetahObj.type = "Cheetah";
        System.out.print(cheetahObj.type+" ");cheetahObj.eat("Gazelle");
        cheetahObj.speak("Roar");


    }
}
