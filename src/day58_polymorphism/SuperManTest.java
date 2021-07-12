package day58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {


        Father spMan1 = new Superman();
        spMan1.playWithKid();
        spMan1.feedKit();
        spMan1.raiseKid();           //Superman is Father now, soo only method from Father can be accessible to spMan1 variable

        Worker spMan2 = new Superman();
        spMan2.work("SDET");
        spMan2.getPaid(8000);             //Superman is Worker now, so only abstract methods from Worker Interface are a/v

        Superman spMan3 = new Superman();
        spMan3.getPaid(9500);
        spMan3.work("Scrum Master");
        spMan3.playWithKid();
        spMan3.feedKit();
        spMan3.raiseKid();                  //Object created from Superman (SubClass which inherited all methods) so all the methods from Worker and Father are a/v




    }
}
