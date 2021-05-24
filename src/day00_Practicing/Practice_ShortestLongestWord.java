package day00_Practicing;

public class Practice_ShortestLongestWord {

    public static void main(String[] args) {


    String [] words = {"dog", "cat", "happy", "government"};

    String longest = words[0];
    String shortest = words [0];


    for (String each : words){
        if (each.length()>longest.length()){
            longest = each;
        }else if(each.length() == longest.length()){

        }
        if (each.length() < shortest.length()){
            shortest = each;
        }else if (each.length()>shortest.length()){

        }

    }

        System.out.println("longest = " + longest);
        System.out.println("shortest = " + shortest);


    }
}
