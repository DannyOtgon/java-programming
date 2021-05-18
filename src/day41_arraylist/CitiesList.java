package day41_arraylist;


import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare arraylist
        ArrayList<String> cities = new ArrayList<>();
        //add values (cities) --> using add methods
        cities.add ("Washington DC");  // 0 index
        cities.add ("New York");       // 1 index
        cities.add ("Vienna");         // 2 index etc..
        cities.add ("LA");
        cities.add ("Tokyo");
        //we can also add differently
        cities.add(0,"Ulaanbaatar");
        //print all values in same line
        System.out.println(cities);
        //print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(cities.size()-1));  //Arraylist uses size instead of length

        //print count of items in arraylist
        System.out.println("Count of items = " + cities.size());

        int size = cities.size();
        System.out.println("there are " + size + " cities in the list");

        //we can use size in for loop and print all values in same line
        for (int i=0; i<cities.size(); i++){                    // print with For Loop
            System.out.print(cities.get(i)+" ");
        }
        System.out.println();                                   //print with For Each Loop
         for (String city : cities){
             System.out.print(cities+" ");
         }


         //how to delete item from arraylist
         //1st option: remove using index  (delete value at index 3)
        cities.remove(3);
         //2nd remove using object /value
        cities.remove("New York");
        System.out.println();
        System.out.println("after remove = " + cities);

        //how to remove/delete everything (all values) --> we use clear method
        cities.clear();

        //how to make sure all values is cleared out. 1st option: just print out
        System.out.println("cities = " + cities);

        //2nd way: using isEmpty method
        if (cities.isEmpty()){
            System.out.println("list is empty");
        }

        //3rd way: check size()== 0
        if (cities.size()==0){
            System.out.println("list is empty");
        }



    }
}
