package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {

        String city = "Tampa";
        if (city.equals("Moscow") || city.equals("Tampa")){
            System.out.println("Willing to relocate to " + city);
        }else{
            System.out.println("Not considering moving to " + city);
        }
        System.out.println("Travel with Passion   :)");
        System.out.println("____________________________________________");



        String teacher = "Benza";
        if (teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is java class with " + teacher);

        }else if (teacher.equals("Nadir")) {
            System.out.println("It is soft skill class with " + teacher);
        } else{
            System.out.println("Some class with " + teacher);
        }

        System.out.println("__________________________________________________________");

        String company = "Google";
        double salary = 100_000;
        if (company.equals("Google") || salary>=100_000){
            System.out.println("Accept Offer");
        }else{
            System.out.println("Renegotiate");
        }


    }
}
