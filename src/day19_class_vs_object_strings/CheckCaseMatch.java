package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "peru";
        if(countryCode.equals(countryCode.toUpperCase())){
            System.out.println("-------------------------------");
        }else{
            System.out.println(("================================="));
        }

        String word = "Kobe";
        System.out.println(word.startsWith("K"));
    }
}
