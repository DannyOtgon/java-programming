package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {

        int numOfBedroom = 1;
        double startingPrice = 0;

        switch (numOfBedroom){
            case 0:
                System.out.println("studio apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println("5 bedroom currently not available");
                break;
        }
        System.out.println("Staring price for "+numOfBedroom+ " bedroom is " + startingPrice);


    }
}
