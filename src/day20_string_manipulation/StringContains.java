package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i")); // true
        System.out.println(company.contains("ital")); // true

        if(company.contains(" ")){
            System.out.println("multiple words company name");
        }else {
            System.out.println("single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        if (etsyTitle.contains (" | ")){
            System.out.println("Pass - title check passed");
        }else{
            System.out.println("Fail - title check failed");
        }

        String email = "murodil@cybertek.com";

        if (email.contains("@") && email.endsWith(".com")){
            System.out.println("Yes");
        }
        if (email.toLowerCase().contains("d")){
            System.out.println("d is present");
        }else{
            System.out.println("d is not present");
        }

        String word = "java";
        System.out.println(word.replace("a","u"));

        String country = "Mongolia";
        System.out.println(country.replace("o","KING"));

        System.out.println();
    }

}
