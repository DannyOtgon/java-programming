package day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("****WELCOME TO TD BANK ATM****");
        int secretPincode = 22_33;
        int inputCode = 2233;

        if (secretPincode == inputCode){
            System.out.println("WELCOME TO YOUR ACCOUNT");
            System.out.println("YOU CAN WITHDRAW, CHECK BALANCE, DEPOSIT");
        }else{
            System.out.println("INCORRECT PINCODE! " + inputCode);
            System.out.println("Please try again");


        }
    }
}
