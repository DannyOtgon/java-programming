package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "Sunny";
        if (weather.equals ("Sunny")){
            System.out.println(weather + " - Go to park, hiking, and code java");
        } else if (weather.equals("rainy")){
            System.out.println (weather + " - stay home, drink tea, and code java");
        } else if (weather.equals ("snowy")){
            System.out.println (weather +" - Clean the car and build snowman, drink hot chocolate and code java");
        } else if (weather.equals ("windy")){
            System.out.println (weather + " - Get read for power loss, fly a kite and code java");
        } else {
            System.out.println("just keep coding java");
        }
    }
}
