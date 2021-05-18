package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("danny0 tgon","pass1234");
        System.out.println("======================================================");
        System.out.println(login("cybertekstudent","abc123"));
        System.out.println("--------------------------------------------------------");

        if (login("sybertekstudent","abc123")){
            System.out.println("Log in succesful, welcome to Canvas!");
        }else{
            System.out.println("Wrong log in info, please try again!");
        }
    }
    public static void loginVoid(String userName, String password){
        String secretUserName = "DannyOtgon";
        String secretPassword = "pass1234";
        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)){
            System.out.println("Logged in succesfully, welcome to cybertek");
        }else{
            System.out.println("Wrong info, please try again.");
        }
    }

    public static boolean login (String userName, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        return secretUserName.equalsIgnoreCase(userName) && secretPassword.equals(password);


    }
}
