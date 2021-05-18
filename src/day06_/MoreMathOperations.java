package day06_;

public class MoreMathOperations {
    public static void main ( String [] args){
        int toyotas = 431;
        int hondas = 233;
        int VW = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 155;
        int totalCarsInParking = toyotas+hondas+VW+tesla+nissan+bmw;
                System.out.println(totalCarsInParking);

                String pizza = "hawaiian";
                int slices = 8;
                int people = 4;
                int slicesPerPerson = slices / people;
                //there are 2 slices per person
        System.out.println(slicesPerPerson);

        System.out.println("We ordered " + pizza + " pizza with " + slices + " slices, "  +people +" people ate " + slicesPerPerson+ " slices each." );
    }

}
