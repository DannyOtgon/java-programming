package day15_logicalops_switch_ternary;

public class CarDealership {
    public static void main(String[] args) {
        double budget = 5000;
        String model = "Toyota";
        double carPrice = 5200;

        if((model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla")) && carPrice <=budget){
            System.out.println("Lets purchase the car!");

        }else{
            System.out.println("Lets look more");
        }
    }
}
