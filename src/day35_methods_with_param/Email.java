package day35_methods_with_param;

import java.util.Locale;

public class Email {
    public static void main(String[] args) {
        buildEmail("kobe","nba");
        buildEmail("KO BEBR Y AND","MAm ba");
    }
    public static void buildEmail(String name, String domain ){
        name = name.replace(" ","_").toLowerCase();
        domain = domain.replace(" ","_").toLowerCase();
        System.out.println("Email: "+name+"@"+domain+".com");
    }
}
