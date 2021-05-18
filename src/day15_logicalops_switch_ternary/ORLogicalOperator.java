package day15_logicalops_switch_ternary;

public class ORLogicalOperator {
    public static void main(String[] args) {

        int apples = 5;
        int oranges = 7;
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false =" + (false || false));

        System.out.println("_____________________________________________");

        System.out.println(apples> 3 || oranges > 4 );

        if (apples >3 || oranges > 4){
            System.out.println("No need to byu any fruits today");
        } else {
            System.out.println("Need to get some fruit");
        }
        System.out.println(apples >2 || oranges >10);
        System.out.println("______________________________________________");

        if (apples > 2 || oranges > 10 ){
            System.out.println("Lookg like we are good with fruit");
        }else {
            System.out.println("Need to buy more fruit");
        }
        System.out.println(apples == 0 || oranges == 0);

    }
}
