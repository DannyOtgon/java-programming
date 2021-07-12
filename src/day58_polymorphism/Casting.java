package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        //create variable of worker and object of superman

        Worker worker = new Superman();
        worker.work("QA Manager");
        worker.getPaid(6000);

        ((Father)worker).raiseKid();
        ((Superman)worker).playWithKid();


        //DOWNCASTING FROM WORKER TO SUPERMAN
        Superman superman = (Superman) worker;



    }
}
