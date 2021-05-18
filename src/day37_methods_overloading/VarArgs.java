package day37_methods_overloading;

public class VarArgs {
    public static void addNums (int... ints) {
        int sum = 0;
        for (int n : ints){
            sum +=n;
        }
        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) {
        addNums(10,5);
        addNums(1,2,3,4,5,8,8,654654,321321,546498,1321,21,54,654,65,4,654,654,6,41,54,13,21,5,7,84,132,1);
    }
}
