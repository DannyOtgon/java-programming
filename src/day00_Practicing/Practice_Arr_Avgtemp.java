package day00_Practicing;
import java.util.*;

public class Practice_Arr_Avgtemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        // Do not touch above. Use array temps
        double avgTemp=0;
        for (int i=0; i<temps.length;i++){
            avgTemp += temps[i];

        }
        System.out.println(avgTemp/temps.length);

    }
}
