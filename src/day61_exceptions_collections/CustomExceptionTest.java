package day61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {

        int minutes = 30;
        System.out.println("class is going on for "+minutes+" minutes");

        if(minutes > 50) {
            throw new BreakTimeException("it is break time!");
        }


        System.out.println("Lets continue the class");


        double balance = 400;
        double itemPrice = 500;
        if (itemPrice > balance){
            throw new InsufficientBalanceException("You don't have enough funds for purchase");
        }
        System.out.println("item successfully purchased");

    }
}
