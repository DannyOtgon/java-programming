package day33_arrays;
import java.util.*;

public class MultiDArrayExample {
    public static void main(String[] args) {
        String [][] users = new String [3][2];
        users [0] [0] = "Micheal Jordan";
        users [0][1] = "airjordan@23";

        users [1] [0] = "Kobe Bryant";
        users [1] [1] = "mambamentality08";

        users [2] [0] = "Allen Iverson";
        users [2] [1] = "theAnswer";

        String [] [] userData = {{  "Micheal Jordan","airjordan@23"  },
                                {   "Kobe Bryant","mambamentality08" },
                                {    "Allen Iverson","theAnswer"     }};

        System.out.println(userData[0][0]);
        System.out.println(userData[1][0]);
        System.out.println(userData[2][0]);

        System.out.println(userData[0][1]);
        System.out.println(userData[1][1]);
        System.out.println(userData[2][1]);

        System.out.println(Arrays.deepToString(userData));


    }
}
