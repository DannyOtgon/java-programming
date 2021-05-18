package day10_shorthand_operators;
import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
        String weather = scan.nextLine();
        System.out.println(weather + " - is a nice day today!");

        //notes:  when using string with variable = scan.next();  (but only 1 word)
        //notes: when using string with variable = scan.nextLine();    (use many words,whole sentence until hit ENTER)






    }
}
