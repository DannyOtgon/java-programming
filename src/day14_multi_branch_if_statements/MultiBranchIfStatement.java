package day14_multi_branch_if_statements;

public class MultiBranchIfStatement {
    public static void main(String[] args) {

        int day = 1;
        if (day == 1){
            System.out.println("Monday");

        }else {
            System.out.println("Not Monday");
        }
        if (day == 2) {
            System.out.println("Tuesday");
        } else {
            System.out.println("Not Tuesday");
        }
        if ( day == 3){
            System.out.println("Wednesday");
        }else{
            System.out.println("Not Wednesday");
        }

        System.out.println("=========================================");
        int day1 = 1;
        if (day1 == 1){
            System.out.println("Monday");
        }else if (day1 == 2) {
            System.out.println("Tuesday");
        }else if (day1 == 3) {
            System.out.println("Wenesday");
        }else{
            System.out.println("java day");
        }
        System.out.println("Everyday code java");



    }
}
