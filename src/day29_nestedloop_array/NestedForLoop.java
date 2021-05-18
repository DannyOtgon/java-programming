package day29_nestedloop_array;

public class NestedForLoop {
    public static void main(String[] args) throws InterruptedException {
        for (int m = 1; m <= 5; m++) {
            System.out.println("\nm = " + m);
            for (int s = 1; s <= 60; s++) {
                System.out.print(s + " ");
            }
        }
        for (int m = 0; m <= 4; m++) {
            for (int s = 0; s < 60; s++) {
                System.out.print("\n" + m + ":" + s);
            }
        }
        System.out.println("==========================================");
        for (int j =0; j<4; j++){
            int k=0;
            while (k<3){
                System.out.print(" |Row"+j+"-Column"+k);
                k++;
            }
            System.out.println();
        }
    }
}
