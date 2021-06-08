package day00_Practicing;

import java.util.*;

public class ScannerArray {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println(name);

        Integer nums = scan.nextInt();
        System.out.println(nums);

        int [] listNums = new int [scan.nextInt()];
        for (int i = 0; i < listNums.length; i++) {
            listNums [i] = scan.nextInt();

        }
        System.out.println(Arrays.toString(listNums));

    }
}

