package day06_;

public class CarDriverInfo {
    public static void main (String [] args){
        String carModel = "Hyundai Genesis";
        String driverName = "Danny Otgon";
        String licenseNum = "T0kDr!ft";
        short speed = 135;
        boolean isAutomatic = true;
        char licType = 'b';

        System.out.println("Car Model is \t\t"+ carModel);
        System.out.println("Driver Name is \t\t"+ driverName);
        System.out.println("License Number is \t"+ licenseNum);
        System.out.println("Speed is \t\t\t"+ speed);
        System.out.println("Is It Automatic? \t"+ isAutomatic);
        System.out.println("License Type \t\t"+ licType);

        System.out.println(driverName +  " is driving " +  carModel);

        System.out.println(10+5);

        String firstName = "Adam";
        String lastName = "Smith";
        String fullName = firstName+" "+ lastName;
        System.out.println(fullName);

        String carBrand = "Toyota";
        String caRModel = "4 Runner";
        String brandModel = carBrand +" "+ caRModel;
        System.out.println(brandModel);
        System.out.println("Danny is driving a "+ brandModel);


       }
}
