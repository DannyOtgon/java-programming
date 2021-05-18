package day10_shorthand_operators;

public class ChangeVariableValue {

    public static void main(String[] args) {
        
        int apples = 2;
        System.out.println("apples = " + apples);
        apples= apples + 10;
        System.out.println("apples = " + apples);
        
        int pizzaSlices = 8;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices / 2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        
        //get another whole small pizza just for you
        pizzaSlices = pizzaSlices + 6;
        System.out.println("pizzaSlices = " + pizzaSlices);
        
        int players = 10;
        System.out.println("players = " + players);
        //how do I double the players to start the match
        players = players * 2;
        System.out.println("players = " + players);

        int cents = 568;
        System.out.println("cents = " + cents);
        cents = cents % 100;
        System.out.println("cents = " + cents);

        
    }
}
