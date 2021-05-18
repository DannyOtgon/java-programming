package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {

        int[] data = {32, 532, 1, 5454, 22, 123, 543, 99, 321, 3};
        for (int each : data) {
            System.out.print(each + ", ");

        }
        System.out.println("\n=================================================");

        for (int n : data) {
            if (n % 2 != 0) {
                System.out.println("Odd Numbers are: " + n);
            } else {
                System.out.println("Even numbers are: " + n);
            }
        }
        System.out.println(data[data.length-1]);

        for (int idx=data.length-1; idx>=0; idx--){
            System.out.print(data[idx] + " ");
        }
    }
}
