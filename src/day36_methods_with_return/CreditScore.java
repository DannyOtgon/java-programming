package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(760);
        checkEligible(800);
        checkEligible(685);
        System.out.println("credit score: "+getCreditScore());
        int score = getCreditScore();
        System.out.println("score = "+ score);
        System.out.println("credit score = " + getCreditScore());

    }
    public static void checkEligible(int creditScore){
        if (creditScore >= 700){
            System.out.println("You are eligible");
        }else{
            System.out.println("You are not eligible");
        }

    }
    public static int getCreditScore(){
        return 800;
    }
}
