package day00_Practicing;
import java.util.*;

public class Practice04_11 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int [] newArr;
        if (size >= 2 ){
            newArr = new int[]{num[0],num[1]};
        }else{
            newArr= new int[]{num[0]};
        }
        System.out.println(Arrays.toString(newArr));
    }
}
