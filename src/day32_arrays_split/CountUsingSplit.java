package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String catTypes = "bengal cat tabby cat persian cat no cat here some other cat type";


        //COUNT HOW MANY CATS USING LONG METHOD
        int count = 0;
        for (int i =0; i<catTypes.length()-2; i++){
            if (catTypes.substring(i,i+3).equals("cat")){
                count++;
            }
        }
        System.out.println("count of catTypes: "+count);



        //COUNT HOW MANY CATS USING SIMPLER METHOD
        String [] catsArray = catTypes.split("cat");
        System.out.println("number of 'cat' = " + (catsArray.length -1));

    }
}
