package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");


        System.out.println(cybertekAddress);

        cybertekAddress.setState("CA");

        System.out.println("After Update : " + cybertekAddress);

        System.out.println("Street info: " + cybertekAddress.getStreet());

        Address newSetAddress = new Address();
        System.out.println(newSetAddress);

        System.out.println("==================================================");

        Address papaJohn = new Address("14615 Lee Hwy", "Centreville", "VA", "20121");
        System.out.println(papaJohn.toString());
    }

}
