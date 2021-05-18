package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "E";
        double leasePrice = 0.0;

        if (make.equals("Mercedes") && model.equals("E")){
            leasePrice = 500.0;
        }else if (make.equals("Mercedes") && model.equals("A")){
         leasePrice = 400.0;
        }
        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);

        System.out.println("============================================");

        String make1 = "Audi";
        String model1 =  "SQ5";
        double leasePriceA = 0.0;

                if(make1.equals("Audi")){
                    if (model1.equals("SQ5")){
                        leasePriceA = 552.0;
                    }else if (model1.equals("A3")){
                        leasePriceA = 412.0;
                    }
                    System.out.println("make1 = " + make1);
                    System.out.println("model1 = " + model1);
                    System.out.println("leasePriceA = " + leasePriceA);
                }






    }
}
