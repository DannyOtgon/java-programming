package day28_loops;

import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();
        String password = "";

        for (int i = 0; i <= 8; i++){
            int index = random.nextInt(71);
            System.out.print(source.charAt(index));
            password += source.charAt(index);
            // System.out.println(random.nextInt(source.length()));

        }
        System.out.println("\nYour password = " + password);

        System.out.println("=================================");

        System.out.println("YOUR NEW PASS: ");

        String bank = "asdlkjsafiohwegoaergodfjnSDGNSIOGJGIJSgpoSEgjp123456789";
        String pass = "";
        for (int p=0; p<=12; p++){
            int index = random.nextInt(bank.length());
            System.out.print(bank.charAt(index));
            pass+=bank.charAt(index);
        }
        System.out.println("\n Your New Pass: " + pass);
    }
}