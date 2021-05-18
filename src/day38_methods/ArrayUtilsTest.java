package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int [] digit = {8,24,1,23};
        ArrayUtils.printArray(digit);
        System.out.println(ArrayUtils.sum(digit));
        System.out.println(ArrayUtils.contains(digit,23));
    }
}
