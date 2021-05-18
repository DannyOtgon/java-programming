package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Mazda");
        myCars.add("Ford");
        myCars.add("Moskvich");
        myCars.add("Tesla");
        myCars.add(0,"Jeep");
        myCars.add(1,"Lada");
        myCars.add(2,"Yugo");

        System.out.println(myCars.toString());

        //how to store all value in String variable
        String allCarsIn1String = myCars.toString();   //saves all cars in 1 string variable
        System.out.println("allCarsIn1String = " + allCarsIn1String);

        //change Jeep to Lamborghini  --> use Set method
        myCars.set(0,"Lamborghini");
        System.out.println("after set = " + myCars);
        myCars.set(4,"Honda");                                   //how to do this if myCars was array --> myCars[4]="Honda";
        System.out.println("after set = " + myCars);

        //find the index number of Ford
        System.out.println("index of Ford = "+myCars.indexOf("Ford"));
        int moskvitchIndex = myCars.indexOf("Moskvich");
        System.out.println("index of moskvitch = " + moskvitchIndex);

        myCars.set(moskvitchIndex, "Jaguar");
        System.out.println("after set = " + myCars);

        int ladaIndex = myCars.indexOf("Lada");
        myCars.set(ladaIndex,"Hummer");

        int yugoIndex = myCars.indexOf("Yugo");
        myCars.set(yugoIndex, "Audi");

        System.out.println(myCars);

        if(myCars.contains("Hummer")){
            myCars.set(myCars.indexOf("Hummer"), "Bugatti");
        }else{
            System.out.println("Hummer not found");
        }
        System.out.println("after set bugatti = " + myCars);

        for (int i=0; i<myCars.size(); i++){
            if (myCars.get(i).equals("Lamborghini")){
                myCars.set(i,"Prius");
            }else if(myCars.get(i).equals("Honda")){
                myCars.set(i,"Lexus");
            }else if(myCars.get(i).equals("Ford")){
                myCars.set(i,"Ferrari");
            }
            System.out.println("New cars = " + myCars);
        }
    }
}
