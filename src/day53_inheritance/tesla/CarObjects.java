package day53_inheritance.tesla;

public class CarObjects {
    public static void main(String[] args) {

        ElectricCar ec1 = new ElectricCar("Tesla", "Model Y", 48190.0, 2021, 326);
        ec1.drive(50);
        System.out.println(ec1);
        System.out.println("ec1.getMake() = " + ec1.getMake());
        System.out.println("ec1.getModel() = " + ec1.getModel());
        System.out.println("ec1.getPrice() = " + ec1.getPrice());
        System.out.println("ec1.getYear() = " + ec1.getYear());
        System.out.println("ec1.getRange() = " + ec1.getRange());

        if (ec1.getPrice()>10000){
            System.out.println(ec1.toString() +" is out of my range");
        } else {
            System.out.println("purchasing " + ec1.toString());
        }

        System.out.println("Count is: "+ElectricCar.getCount());

        ElectricCar ec2 = new ElectricCar("Tesla", "Cybertruck", 59900, 2022, 300);
        System.out.println(ec2);
        System.out.println("ElectricCar.getCount() = " + ElectricCar.getCount());

        Roadster roadster = new Roadster("Roadster", 200000,2022,600);
        System.out.println(roadster.toString());
        roadster.drive(600);
        System.out.println("ElectricCar.getCount() = " + ElectricCar.getCount());


    }
}
