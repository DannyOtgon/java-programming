package day16_switch_ternary;

public class CapuccinoBuyer {
    public static void main(String[] args) {

        String size = "venti";
        double price = 0.0;
        int calories = 0;

        switch (size){
            case "tall":
                System.out.println("Tall cappucino please");
                price = 3.69;
                calories = 90;
                break;
            case "grande":
                System.out.println("Grande cappucino please");
                price = 3.99;
                calories = 120;
                break;
            case "venti":
                System.out.println("Venti cappucino please");
                price = 4.29;
                calories = 150;
                break;
            default:
                System.out.println("We don't have that size " +size+(" Cappucino"));
                break;
        }

        System.out.println("Total Price: $" + price );
        System.out.println("You will consume " + calories + " cals of energy");



    }
}
