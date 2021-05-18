package day00_Practicing;
import java.sql.SQLOutput;
import java.util.*;

public class Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        // this part is already provided DO NOT CHANGE
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = scan.next();
        scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.next();
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();
        // continue for city
        scan.nextLine();
        System.out.println("Enter your city");
        String city = scan.next();
        scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.next();
        scan.nextLine();
        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();
        scan.nextLine();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();
        scan.nextLine();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        scan.nextLine();
        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        System.out.println("Patient personal information");
        System.out.println("Full name: "+lastName+", "+firstName);
        System.out.println("Address: " + street + ", "+city+", "+state+" "+zipcode);
        System.out.println("Contacts: work phone number - "+workPhoneNumber+", personal phone number - "+personalPhoneNumber+", email: "+email);
        System.out.println("Age: "+ age);
        System.out.println("Height: "+ height);
        System.out.println("Weight: "+weight+" pounds");
        System.out.println("Married?: "+isMarried);




    }
}
