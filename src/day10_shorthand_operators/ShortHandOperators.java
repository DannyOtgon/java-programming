package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars +=5;
        cars +=2;
        System.out.println("cars = " + cars);
        
        cars -=6;
        System.out.println("cars in parking lot = " + cars);

        int electricCars = 13;
        //cars +=cars + electricCars;
        cars += electricCars;
        System.out.println("cars = " + cars);
        System.out.println();

        String word = "Java";
        System.out.println("word is " + word);
        word = word + "programming";
        System.out.println("word is " + word);

        System.out.println();
        word += " is fun";
        System.out.println("word is " + word);

        System.out.println();
        String selenium = " but selenium is more fun.";
        word += selenium;
        System.out.println("word is " + word);

        word +=12345;
        System.out.println("Word = " + word);

        System.out.println();

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        letter += 1;
        System.out.println("letter = " + letter);
        System.out.println();

        double parkingFee = 7.50;
        System.out.println("normal parking fee = " + parkingFee);
        parkingFee /=2;
        System.out.println("earl bird parking fee " + parkingFee );
        parkingFee -= parkingFee;
        System.out.println("Weekend parking fee = " + parkingFee);







    }
}
