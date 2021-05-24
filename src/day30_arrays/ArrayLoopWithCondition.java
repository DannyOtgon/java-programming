package day30_arrays;

public class ArrayLoopWithCondition {
    public static void main(String[] args) {
        double [] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};

        for (double eachPrice : prices){

            if (eachPrice > 100){
                System.out.print(eachPrice+" ");
            }
        }

        System.out.println("\n---- prices between 10 and 70 -----");

        for (double eachPrice : prices){              //print variables b/w 10 to 70
            if (eachPrice>=10 && eachPrice<=70){
                System.out.print(eachPrice+" ");
            }
        }
        int num = 0;
        System.out.println("=======================================");
        for (double i : prices){
            if (i>50){
                System.out.println(i);
                num++;


            }
        }
        System.out.println("Number of prices that are more than 50: "+ num);

        System.out.println("\n--------------Countries with name length more than 7 -----------");

        int longCountry = 0;
        for (String countryName : countries){
            if (countryName.length()>7){
                System.out.print(countryName + " | ");
                longCountry++;
            }
        }
        System.out.println("\nNumber of Countries with names more than 7 letter : " + longCountry);
    }
}


