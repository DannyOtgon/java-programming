package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {

        String list = "cat,car,black cat, red car";
        //int i = 0;
        //System.out.println(list.substring(i,i+3));
        //i++;
        //System.out.println(list.substring(i,i+3));
        //System.out.println(list.substring(2,5));
        //System.out.println(list.substring(3,6));
        //System.out.println(list.substring(4,7));

        //*****LETS TRY WITH FOR LOOP

        for (int i = 0; i<list.length()-2; i++){
            System.out.println(list.substring(i, i+3));
            //we could also assign variable: String part = list.substring(i,i+3);
            if (list.substring(i,i+3).equals("cat") || list.substring(i,i+3).equals("car")){
                System.out.println("cat or car found");

            }
        }
    }
}
