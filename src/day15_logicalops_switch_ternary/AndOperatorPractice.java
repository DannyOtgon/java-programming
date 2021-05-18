package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {

        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Wooden Spoon";

        if (onSale && freeShipping) {
            System.out.println("Adding to cart - " + itemName);
        }else {
            System.out.println("Continue shopping " + itemName);
        }

        if (onSale && freeShipping && itemName.equals("Wooden Spoon")) {
            System.out.println("Adding to cart - " + itemName);
        }else {
            System.out.println("Continue shopping " + itemName);
        }
        System.out.println("------------------------------------------");
        //location, salary, isRemote, benefits
        String location = "Virginia";
        double salary = 100_000;
        boolean isRemote = true;
        boolean benefits = true;

        if ( salary>=100000 && location.equals("Virginia") && isRemote && benefits){
            System.out.println("Accept job offer");
        } else {
            System.out.println("Move on to next interview");
        }



    }
}
