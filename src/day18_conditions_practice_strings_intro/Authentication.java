package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int expLast4SSN = 1234;
        int expPinCode = 4321;

        int last4SSN = 1134;
        int pinCode = 4421;

        if (last4SSN == expLast4SSN && pinCode == expPinCode){
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed. Please try again");
            if (last4SSN != expLast4SSN){
                System.out.println("Last 4 SSN number is incorrect");
                if (pinCode != expPinCode){
                    System.out.println("pincode is incorrect");
                }
            }
        }
    }
}
