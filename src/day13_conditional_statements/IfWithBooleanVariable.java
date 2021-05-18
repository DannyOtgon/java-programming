package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {

        boolean isHungry = true;

        if(isHungry = false){
            System.out.println("I am hungry, I will go get something to eat!");
            System.out.println("Then code java");
        }else{
            System.out.println("I am not hungry, I will keep coding java!");
        }
        System.out.println();

        double price = 230.44;
        boolean isAffordable = price <= 200.0;
        if(isAffordable){
            System.out.println("Its affordable, lets buy it");
        }else {
            System.out.println("Too expensive, lets keep coding java");
        }
        System.out.println();

        boolean isRemoteJob = true;
        if (isRemoteJob != true){
            System.out.println("Sorry I am not interested");
        }else{
            System.out.println("Sure I am interested, what is the interview process?");
        }

    }
}
