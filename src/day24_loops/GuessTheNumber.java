package day24_loops;

import java.util.*;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner scan = new Scanner (System.in);
        //System.out.println(randomNum.nextInt(101));
        int secretNumber = randomNum.nextInt(101);
        int guessNumber = 0;


        do{
            System.out.println("Guess the secret number");
            guessNumber = scan.nextInt();
            if(guessNumber > secretNumber){
                System.out.println("wrong, your number it too large");
            }else if (guessNumber < secretNumber){
                System.out.println("wrong, your number is too small");
            }
        }while (secretNumber != guessNumber);
        System.out.println("CONGRATULATIONS!");
        }
    }

