package day00_Practicing;

public class Practice_EvenOddArray {
    public static void main(String[] args) {
        int [] nums = {2,4,5,5,6,8,7,9,11};

        int numberOfOddNumbers = 0;
        int numberOfEvenNumbers = 0;

        for (int each : nums) {
            if (each % 2 == 0){
                numberOfEvenNumbers++ ;
                System.out.println(each + " even");
            }else{
                numberOfOddNumbers++ ;
                System.out.println(each + " odd");

            }
        }
        System.out.println("even nums = "+numberOfEvenNumbers);
        System.out.println("odd nums = "+numberOfOddNumbers);



    }
}
